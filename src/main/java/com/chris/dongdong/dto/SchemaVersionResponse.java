// 响应DTO
package com.chris.dongdong.dto;

import lombok.Data;
import java.time.LocalDateTime;

@Data
public class SchemaVersionResponse {
    private Long versionId;
    private Long schemaId;
    private String version;
    private String status;
    private LocalDateTime effectiveTime;
    private String schemaDefinition;
}