package com.chris.dongdong.entity;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class DynamicFieldValueEntity {
    private Long dataId;
    private String fieldKey;
    private String stringValue;
    private BigDecimal numberValue;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date dateValue;
    private String enumValue;
}