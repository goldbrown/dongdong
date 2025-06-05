package com.chris.dongdong.dto;

import lombok.Data;

import java.util.Date;

@Data
public class DynamicDataRequest {
    private Long dataId;
    private String schemaId;
    private Long versionId;
    private String createdBy;
    private Date createdAt;
}
