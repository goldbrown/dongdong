package com.chris.dongdong.controller;

import com.chris.dongdong.dto.CommonResponse;
import com.chris.dongdong.entity.SchemaFieldEntity;
import com.chris.dongdong.service.SchemaFieldService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/schema-fields")
public class SchemaFieldController {

    private final SchemaFieldService service;

    public SchemaFieldController(SchemaFieldService service) {
        this.service = service;
    }

    @PostMapping("/create")
    public CommonResponse create(@RequestBody SchemaFieldEntity field) {
        service.create(field);
        return CommonResponse.success();
    }

    @PostMapping("/update/{id}")
    public CommonResponse update(
            @PathVariable Long id,
            @RequestBody SchemaFieldEntity field) {
        field.setId(id);
        service.update(field);
        return CommonResponse.success();
    }

    @GetMapping("/version/{versionId}")
    public CommonResponse<List<SchemaFieldEntity>> getByVersionId(@PathVariable Long versionId) {
        return CommonResponse.success(service.selectByVersionId(versionId));
    }
}