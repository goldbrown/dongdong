package com.chris.dongdong.mapper;

import com.chris.dongdong.entity.DynamicFieldValue;
import org.apache.ibatis.annotations.*;

@Mapper
public interface DynamicFieldMapper {

    int insert(DynamicFieldValue entity);
    int update(DynamicFieldValue entity);
}