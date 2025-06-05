package com.chris.dongdong.mapper;


import com.chris.dongdong.entity.BusinessSchemaEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BusinessSchemaMapper {
    int insertBusinessSchema(BusinessSchemaEntity businessSchema);
    int updateBusinessSchema(BusinessSchemaEntity businessSchema);
    BusinessSchemaEntity selectBusinessSchemaById(Long schemaId);
    List<BusinessSchemaEntity> selectAllBusinessSchemas();
}