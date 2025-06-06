package com.chris.dongdong.entity;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
public class DynamicDataEntity {
    private Long dataId;
    private String schemaId;
    private Long versionId;
    private String createdBy;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createdAt;
}