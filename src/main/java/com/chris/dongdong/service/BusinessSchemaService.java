package com.chris.dongdong.service;

import com.chris.dongdong.entity.BusinessSchemaEntity;
import com.chris.dongdong.mapper.BusinessSchemaMapper;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class BusinessSchemaService {

    private final BusinessSchemaMapper mapper;

    public BusinessSchemaService(BusinessSchemaMapper mapper) {
        this.mapper = mapper;
    }

    public void create(BusinessSchemaEntity schema) {
        mapper.insertBusinessSchema(schema);
    }

    public void update(BusinessSchemaEntity schema) {
        mapper.updateBusinessSchema(schema);
    }

    public BusinessSchemaEntity getById(Long schemaId) {
        return mapper.selectBusinessSchemaById(schemaId);
    }

    public List<BusinessSchemaEntity> getAll() {
        return mapper.selectAllBusinessSchemas();
    }
}