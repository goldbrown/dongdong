package com.chris.dongdong.mapper;

import com.chris.dongdong.entity.SchemaVersionEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface SchemaVersionMapper {
    int insert(SchemaVersionEntity entity);
    int update(SchemaVersionEntity entity);
    SchemaVersionEntity selectById(Long versionId);
    List<SchemaVersionEntity> selectBySchemaId(Long schemaId);
}