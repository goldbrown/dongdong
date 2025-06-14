package com.chris.dongdong.controller;

import com.chris.dongdong.dto.CommonResponse;
import com.chris.dongdong.entity.BusinessSchemaEntity;
import com.chris.dongdong.service.BusinessSchemaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/business-schemas")
public class BusinessSchemaController {

    private final BusinessSchemaService service;

    public BusinessSchemaController(BusinessSchemaService service) {
        this.service = service;
    }

    @PostMapping("/create")
    public CommonResponse create(@RequestBody BusinessSchemaEntity schema) {
        service.create(schema);
        return CommonResponse.success();
    }

    @PostMapping("/update/{schemaId}")
    public CommonResponse update(
            @PathVariable Long schemaId,
            @RequestBody BusinessSchemaEntity schema) {
        schema.setSchemaId(schemaId);
        service.update(schema);
        return CommonResponse.success();
    }

    @GetMapping("/{schemaId}")
    public CommonResponse<BusinessSchemaEntity> getById(@PathVariable Long schemaId) {
        return CommonResponse.success(service.getById(schemaId));
    }

    @GetMapping("/getAll")
    public CommonResponse<List<BusinessSchemaEntity>> getAll() {
        return CommonResponse.success(service.getAll());
    }
}