package com.chris.dongdong.service;

import com.chris.dongdong.entity.DynamicFieldValue;
import com.chris.dongdong.mapper.DynamicFieldValueMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DynamicFieldValueService {
    @Autowired
    private DynamicFieldValueMapper mapper;

    public DynamicFieldValueService(DynamicFieldValueMapper mapper) {
        this.mapper = mapper;
    }

    public void create(DynamicFieldValue fieldValue) {
        mapper.insert(fieldValue);
    }

    public void update(DynamicFieldValue fieldValue) {
        mapper.update(fieldValue);
    }
}