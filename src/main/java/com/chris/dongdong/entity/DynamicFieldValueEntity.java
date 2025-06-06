package com.chris.dongdong.entity;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class DynamicFieldValueEntity {
    private Long dataId;
    private String fieldKey;
    private String stringValue;
    private BigDecimal numberValue;
    private Date dateValue;
    private String enumValue;
}