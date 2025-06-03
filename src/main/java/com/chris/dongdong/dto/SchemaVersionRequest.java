package com.chris.dongdong.dto;

import lombok.Data;

@Data
public class SchemaVersionRequest {
    private Long schemaId;
    private String version;
    private String status;
    private java.util.DateTime effectiveTime;
    private String schemaDefinition;
}

