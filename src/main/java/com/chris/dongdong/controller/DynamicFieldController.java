package com.chris.dongdong.controller;

import com.chris.dongdong.entity.DynamicFieldValue;
import com.chris.dongdong.service.DynamicFieldService;
import com.chris.dongdong.dto.CommonResponse;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/dynamic-fields")
public class DynamicFieldController {

    private final DynamicFieldService service;

    public DynamicFieldController(DynamicFieldService service) {
        this.service = service;
    }

    @PostMapping
    public CommonResponse create(@RequestBody DynamicFieldValue fieldValue) {
        service.create(fieldValue);
        return CommonResponse.success();
    }

    @PutMapping("/{dataId}/{fieldKey}")
    public CommonResponse update(
            @PathVariable Long dataId,
            @PathVariable String fieldKey,
            @RequestBody DynamicFieldValue fieldValue) {
        fieldValue.setDataId(dataId);
        fieldValue.setFieldKey(fieldKey);
        service.update(fieldValue);
        return CommonResponse.success();
    }
}