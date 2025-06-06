package com.chris.dongdong.entity;

import lombok.Data;

import java.util.Date;

@Data
public class SchemaVersionEntity {
    private Long versionId;
    private Long schemaId;
    private String version;
    private String status;
    private Date effectiveTime;
    private String schemaDefinition;
}