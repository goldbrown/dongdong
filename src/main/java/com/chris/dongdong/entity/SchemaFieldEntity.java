package com.chris.dongdong.entity;

import lombok.Data;

@Data
public class SchemaFieldEntity {
    private Long id;
    private Long versionId;
    private String fieldKey;
    private String displayName;
    private String dataType;
    private String optionalConstraint;
}