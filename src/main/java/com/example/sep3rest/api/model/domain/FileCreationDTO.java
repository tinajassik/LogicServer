package com.example.sep3rest.api.model.domain;

import com.example.sep3rest.protobuf.Logicserver;

public class FileCreationDTO {

    private String title;
    private String description;
    private Category category;
    private User uploadedBy;
    private byte[] bytes;
    private String contentType;

    public FileCreationDTO(String title, String description, Category category, User uploadedBy, byte[] bytes) {
        this.title = title;
        this.description = description;
        this.category = category;
        this.uploadedBy = uploadedBy;
        this.bytes = bytes;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public Category getCategory() {
        return category;
    }

    public User getUploadedBy() {
        return uploadedBy;
    }

    public byte[] getBytes() {
        return bytes;
    }
}
