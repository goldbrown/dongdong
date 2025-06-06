package com.chris.dongdong.dto;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
public class DynamicDataRequest {
    private Long dataId;
    private String schemaId;
    private Long versionId;
    private String createdBy;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createdAt;
}
