package com.chris.dongdong.dto;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class DynamicDataRequestDTO {
    private Long dataId;
    private String schemaId;
    private Long versionId;
    private String createdBy;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createdAt;

    // 无参构造器
    public DynamicDataRequestDTO() {
    }

    // 全参构造器
    public DynamicDataRequestDTO(Long dataId, String schemaId, Long versionId, String createdBy, Date createdAt) {
        this.dataId = dataId;
        this.schemaId = schemaId;
        this.versionId = versionId;
        this.createdBy = createdBy;
        this.createdAt = createdAt;
    }

    // Getter和Setter方法
    public Long getDataId() {
        return dataId;
    }

    public void setDataId(Long dataId) {
        this.dataId = dataId;
    }

    public String getSchemaId() {
        return schemaId;
    }

    public void setSchemaId(String schemaId) {
        this.schemaId = schemaId;
    }

    public Long getVersionId() {
        return versionId;
    }

    public void setVersionId(Long versionId) {
        this.versionId = versionId;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
}