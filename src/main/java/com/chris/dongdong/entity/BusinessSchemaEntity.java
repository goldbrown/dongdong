package com.chris.dongdong.entity;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
public class BusinessSchemaEntity {
    private Long schemaId;
    private String tenantId = "default";
    private String creator = "";
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;
}