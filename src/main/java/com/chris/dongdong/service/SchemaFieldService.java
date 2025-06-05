package com.chris.dongdong.service;

import com.chris.dongdong.entity.SchemaFieldEntity;
import com.chris.dongdong.mapper.SchemaFieldMapper;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class SchemaFieldService {

    private final SchemaFieldMapper mapper;

    public SchemaFieldService(SchemaFieldMapper mapper) {
        this.mapper = mapper;
    }

    public void create(SchemaFieldEntity field) {
        mapper.insert(field);
    }

    public void update(SchemaFieldEntity field) {
        mapper.update(field);
    }

    public List<SchemaFieldEntity> selectByVersionId(Long versionId) {
        return mapper.selectByVersionId(versionId);
    }
}