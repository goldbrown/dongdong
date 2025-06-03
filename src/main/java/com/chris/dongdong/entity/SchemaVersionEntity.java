package com.chris.dongdong.entity;

import lombok.Data;
import java.time.LocalDateTime;

@Data
public class SchemaVersionEntity {
    private Long versionId;
    private Long schemaId;
    private String version;
    private String status;
    private DateTime effectiveTime;
    private String schemaDefinition;
}