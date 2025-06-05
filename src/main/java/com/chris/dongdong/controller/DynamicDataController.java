package com.chris.dongdong.controller;

import com.chris.dongdong.dto.CommonResponse;
import com.chris.dongdong.dto.DynamicDataRequestDTO;
import com.chris.dongdong.dto.DynamicDataRequestDTO;
import com.chris.dongdong.service.DynamicDataService;
import jakarta.annotation.Resource;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/dynamic-data")
public class DynamicDataController {
    // ... existing code ...
    @Resource
    private DynamicDataService service;

    @PostMapping
    public CommonResponse create(@RequestBody DynamicDataRequestDTO request) {
         service.create(request);
         return CommonResponse.success();
    }
}