package com.chris.dongdong.entity;

import lombok.Data;

@Data
public class BusinessSchemaEntity {
    private Long schemaId;
    private String tenantId = "default";
    private String creator = "";
    private DateTime createTime;
}