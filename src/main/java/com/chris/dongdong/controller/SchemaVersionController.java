package com.chris.dongdong.controller;

import com.chris.dongdong.dto.SchemaVersionRequest;
import com.chris.dongdong.dto.SchemaVersionResponse;
import com.chris.dongdong.service.SchemaVersionService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/schema-versions")
public class SchemaVersionController {

    private final SchemaVersionService service;

    public SchemaVersionController(SchemaVersionService service) {
        this.service = service;
    }

    @PostMapping("/create")
    public SchemaVersionResponse create(@RequestBody SchemaVersionRequest request) {
        return service.create(request);
    }

    @PostMapping("/update/{versionId}")
    public SchemaVersionResponse update(
            @PathVariable Long versionId, 
            @RequestBody SchemaVersionRequest request) {
        return service.update(versionId, request);
    }
}