package com.chris.dongdong.mapper;

import com.chris.dongdong.entity.SchemaVersionEntity;
import java.util.List;

public interface SchemaVersionMapper {
    int insert(SchemaVersionEntity entity);
    int update(SchemaVersionEntity entity);
    SchemaVersionEntity selectById(Long versionId);
    List<SchemaVersionEntity> selectBySchemaId(Long schemaId);
}