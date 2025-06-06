package com.chris.dongdong.mapper;


import com.chris.dongdong.entity.DynamicDataEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DynamicDataMapper {
    int insert(DynamicDataEntity entity);
    int update(DynamicDataEntity entity);
    DynamicDataEntity selectByDataId(Long dataId);
    List<DynamicDataEntity> selectBySchema(String schemaId, Long versionId);
}