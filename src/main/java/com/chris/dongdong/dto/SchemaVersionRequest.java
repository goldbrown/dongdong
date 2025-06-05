package com.chris.dongdong.dto;

import lombok.Data;

import java.util.Date;

@Data
public class SchemaVersionRequest {
    private Long schemaId;
    private String version;
    private String status;
    private Date effectiveTime;
    private String schemaDefinition;
}

