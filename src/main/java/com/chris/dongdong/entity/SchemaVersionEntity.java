package com.chris.dongdong.entity;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
public class SchemaVersionEntity {
    private Long versionId;
    private Long schemaId;
    private String version;
    private String status;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date effectiveTime;
    private String schemaDefinition;
}