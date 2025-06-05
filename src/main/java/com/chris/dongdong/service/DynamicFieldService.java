package com.chris.dongdong.service;

import com.chris.dongdong.entity.DynamicFieldValue;
import com.chris.dongdong.mapper.DynamicFieldMapper;
import org.springframework.stereotype.Service;

@Service
public class DynamicFieldService {

    private final DynamicFieldMapper mapper;

    public DynamicFieldService(DynamicFieldMapper mapper) {
        this.mapper = mapper;
    }

    public void create(DynamicFieldValue fieldValue) {
        mapper.insert(fieldValue);
    }

    public void update(DynamicFieldValue fieldValue) {
        mapper.update(fieldValue);
    }
}