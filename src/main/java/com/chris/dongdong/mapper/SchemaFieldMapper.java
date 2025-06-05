package com.chris.dongdong.mapper;

import com.chris.dongdong.entity.SchemaFieldEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface SchemaFieldMapper {
    int insert(SchemaFieldEntity entity);
    int update(SchemaFieldEntity entity);
    List<SchemaFieldEntity> selectByVersionId(Long versionId);
}