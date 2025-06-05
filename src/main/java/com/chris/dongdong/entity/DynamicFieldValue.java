package com.chris.dongdong.entity;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class DynamicFieldValue {
    private Long dataId;
    private String fieldKey;
    private String stringValue;
    private BigDecimal numberValue;
    private Date dateValue;
    private String enumValue;

    // getters and setters...
    // 此处省略getter/setter方法，实际需补充完整
}