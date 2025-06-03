package com.chris.dongdong.mapper;


import com.chris.dongdong.entity.BusinessSchemaEntity;
import java.util.List;

public interface BusinessSchemaMapper {
    int insertBusinessSchema(BusinessSchemaEntity businessSchema);
    int updateBusinessSchema(BusinessSchemaEntity businessSchema);
    BusinessSchemaEntity selectBusinessSchemaById(Long schemaId);
    List<BusinessSchemaEntity> selectAllBusinessSchemas();
}