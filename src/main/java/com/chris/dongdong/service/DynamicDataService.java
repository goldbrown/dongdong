package com.chris.dongdong.service;

import com.chris.dongdong.dto.DynamicDataRequest;
import com.chris.dongdong.dto.DynamicDataRequestDTO;
import com.chris.dongdong.dto.DynamicDataResponseDTO;
import com.chris.dongdong.dto.DynamicDataResponseDTO;
import com.chris.dongdong.entity.DynamicDataEntity;
import com.chris.dongdong.mapper.DynamicDataMapper;
import jakarta.annotation.Resource;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
public class DynamicDataService {
    // ... existing code ...
    @Resource
    private DynamicDataMapper dynamicDataMapper;

    public boolean create(DynamicDataRequestDTO request) {
        DynamicDataEntity entity = new DynamicDataEntity();
        BeanUtils.copyProperties(request, entity);
        dynamicDataMapper.insert(entity);
        return true;
    }

    private DynamicDataResponseDTO convertToResponse(DynamicDataEntity entity) {
        DynamicDataResponseDTO response = new DynamicDataResponseDTO();
        BeanUtils.copyProperties(entity, response);
        return response;
    }
}