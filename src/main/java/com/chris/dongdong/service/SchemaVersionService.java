package com.chris.dongdong.service;

import com.chris.dongdong.dto.SchemaVersionRequest;
import com.chris.dongdong.dto.SchemaVersionResponse;
import com.chris.dongdong.entity.SchemaVersionEntity;
import com.chris.dongdong.mapper.SchemaVersionMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
public class SchemaVersionService {

    private final SchemaVersionMapper mapper;

    public SchemaVersionService(SchemaVersionMapper mapper) {
        this.mapper = mapper;
    }

    public SchemaVersionResponse create(SchemaVersionRequest request) {
        SchemaVersionEntity entity = new SchemaVersionEntity();
        BeanUtils.copyProperties(request, entity);
        mapper.insert(entity);
        return convertToResponse(entity);
    }

    public SchemaVersionResponse update(Long versionId, SchemaVersionRequest request) {
        SchemaVersionEntity entity = mapper.selectById(versionId);
        BeanUtils.copyProperties(request, entity);
        mapper.update(entity);
        return convertToResponse(entity);
    }

    private SchemaVersionResponse convertToResponse(SchemaVersionEntity entity) {
        SchemaVersionResponse response = new SchemaVersionResponse();
        BeanUtils.copyProperties(entity, response);
        return response;
    }
}