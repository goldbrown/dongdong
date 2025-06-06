
# DB设计
create database db_dongdong;

**核心表结构设计：**
```sql
-- Schema主表（管理业务对象）
CREATE TABLE business_schema (
  schema_id bigint auto_increment primary key,  -- 业务对象标识（如：promotion_rule）
  tenant_id VARCHAR(20) character set utf8mb4 collate utf8mb4_bin DEFAULT 'default',  -- 多租户隔离预留字段
  creator VARCHAR(50) character set utf8mb4 collate utf8mb4_bin NOT NULL default '',
  create_time DATETIME default current_timestamp,
  INDEX idx_tenant_id (tenant_id)  -- 多租户场景下的常见查询优化
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4;

-- Schema版本表（支持多版本演进）
CREATE TABLE schema_version (
  version_id BIGINT AUTO_INCREMENT PRIMARY KEY,
  schema_id bigint NOT NULL,
  version VARCHAR(20) character set utf8mb4 collate utf8mb4_bin NOT NULL,  -- 语义化版本（如：2.1.0）
  status ENUM('DRAFT', 'PUBLISHED', 'DEPRECATED') DEFAULT 'DRAFT',
  effective_time DATETIME,  -- 版本生效时间
  schema_definition JSON NOT NULL,  -- 存储完整的字段定义
  UNIQUE KEY unique_schema_version (schema_id, version),
  INDEX idx_status (status),
  INDEX idx_schema_id (schema_id)  
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- 字段元数据快照（按版本存储）
CREATE TABLE schema_field (
  id bigint auto_increment primary key,
  version_id BIGINT NOT NULL,
  field_key VARCHAR(50) character set utf8mb4 collate utf8mb4_bin NOT NULL,
  display_name VARCHAR(100) character set utf8mb4 collate utf8mb4_bin,
  data_type varchar(20) character set utf8mb4 collate utf8mb4_bin, --STRING NUMBER DATE BOOLEAN
  optinal_constraint JSON default null,  -- {required:true, format:"email", min:0, options:[]}
  index idx_version_field (version_id, field_key),
  INDEX idx_field_key (field_key)  -- 加速字段级查询
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
```

**2. 动态数据存储方案**  
采用 **宽表+版本映射模式**：
```sql
-- 动态数据主表（所有业务数据入口）
CREATE TABLE dynamic_data (
  data_id BIGINT AUTO_INCREMENT PRIMARY KEY,
  schema_id VARCHAR(50) NOT NULL,
  version_id BIGINT NOT NULL,  -- 关联schema_version
  created_by VARCHAR(50) NOT NULL,
  created_at DATETIME DEFAULT CURRENT_TIMESTAMP,
  INDEX idx_schema (schema_id, version_id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- 动态字段值存储表（支持高效查询）
CREATE TABLE dynamic_field_values (
  data_id BIGINT NOT NULL,
  field_key VARCHAR(50) NOT NULL,
  string_value VARCHAR(500),
  number_value DECIMAL(18,4),
  date_value DATETIME,
  enum_value VARCHAR(100),
  PRIMARY KEY (data_id, field_key),
  INDEX idx_string (string_value(100)),
  INDEX idx_number (number_value),
  INDEX idx_enum (enum_value)  -- 新增enum类型索引
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4
PARTITION BY KEY(data_id) PARTITIONS 16;  -- 按数据ID分片，默认16个分区
```