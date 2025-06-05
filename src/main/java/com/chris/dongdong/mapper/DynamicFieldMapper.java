package com.chris.dongdong.mapper;

import com.chris.dongdong.entity.DynamicFieldValue;
import org.apache.ibatis.annotations.*;


public interface DynamicFieldMapper {

    int insert(DynamicFieldValue entity);
    int update(DynamicFieldValue entity);
}