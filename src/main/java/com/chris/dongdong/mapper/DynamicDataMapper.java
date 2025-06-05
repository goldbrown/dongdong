package com.chris.dongdong.mapper;

import com.chris.dongdong.entity.DynamicData;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

@Mapper
public interface DynamicDataMapper {
    int insert(DynamicData entity);
    int update(DynamicData entity);
    DynamicData selectByDataId(Long dataId);
    List<DynamicData> selectBySchema(String schemaId, Long versionId);
}