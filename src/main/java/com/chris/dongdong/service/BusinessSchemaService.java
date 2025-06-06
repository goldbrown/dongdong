package com.chris.dongdong.service;

import com.chris.dongdong.entity.BusinessSchemaEntity;
import com.chris.dongdong.mapper.BusinessSchemaMapper;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BusinessSchemaService {
    @Autowired
    private BusinessSchemaMapper mapper;

//    public BusinessSchemaService(BusinessSchemaMapper mapper) {
//        this.mapper = mapper;
//    }

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