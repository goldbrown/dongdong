package com.chris.dongdong.controller;

import com.chris.dongdong.dto.CommonResponse;
import com.chris.dongdong.entity.DynamicFieldValue;
import com.chris.dongdong.service.DynamicFieldValueService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/dynamic-fields")
public class DynamicFieldValueController {

    private final DynamicFieldValueService service;

    public DynamicFieldValueController(DynamicFieldValueService service) {
        this.service = service;
    }

    @PostMapping("/create")
    public CommonResponse create(@RequestBody DynamicFieldValue fieldValue) {
        service.create(fieldValue);
        return CommonResponse.success();
    }

    @PostMapping("/update/{dataId}/{fieldKey}")
    public CommonResponse<Void> update(
            @PathVariable Long dataId,
            @PathVariable String fieldKey,
            @RequestBody DynamicFieldValue fieldValue) {
        fieldValue.setDataId(dataId);
        fieldValue.setFieldKey(fieldKey);
        service.update(fieldValue);
        return CommonResponse.success();
    }
}