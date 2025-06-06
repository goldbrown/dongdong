package com.chris.dongdong.dto;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
public class SchemaVersionRequest {
    private Long schemaId;
    private String version;
    private String status;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date effectiveTime;
    private String schemaDefinition;
}

