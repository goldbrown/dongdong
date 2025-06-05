package com.chris.dongdong.mapper;

import com.chris.dongdong.entity.SchemaFieldEntity;
import java.util.List;

public interface SchemaFieldMapper {
    int insert(SchemaFieldEntity entity);
    int update(SchemaFieldEntity entity);
    List<SchemaFieldEntity> selectByVersionId(Long versionId);
}