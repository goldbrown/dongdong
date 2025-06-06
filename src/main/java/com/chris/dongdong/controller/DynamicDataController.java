package com.chris.dongdong.controller;

import com.chris.dongdong.dto.CommonResponse;
import com.chris.dongdong.dto.DynamicDataRequestDTO;
import com.chris.dongdong.service.DynamicDataService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/dynamic-data")
public class DynamicDataController {
    // ... existing code ...
    @Resource
    private DynamicDataService service;

    @PostMapping("/create")
    public CommonResponse create(@RequestBody DynamicDataRequestDTO request) {
         service.create(request);
         return CommonResponse.success();
    }
}