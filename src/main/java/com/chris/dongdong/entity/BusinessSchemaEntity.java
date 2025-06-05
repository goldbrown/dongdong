package com.chris.dongdong.entity;

import lombok.Data;

import java.util.Date;

@Data
public class BusinessSchemaEntity {
    private Long schemaId;
    private String tenantId = "default";
    private String creator = "";
    private Date createTime;
}