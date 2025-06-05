package com.chris.dongdong.entity;

import lombok.Data;
import java.time.LocalDateTime;
import java.util.Date;

@Data
public class DynamicDataEntity {
    private Long dataId;
    private String schemaId;
    private Long versionId;
    private String createdBy;
    private Date createdAt;
}