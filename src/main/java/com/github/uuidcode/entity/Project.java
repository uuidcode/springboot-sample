package com.github.uuidcode.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class Project {
    @Id
    private Long projectId;

    @Column
    private String name;

    private LocalDateTime addedDateTime;

    private LocalDateTime updatedDateTime;

    public LocalDateTime getUpdatedDateTime() {
        return this.updatedDateTime;
    }

    public Project setUpdatedDateTime(LocalDateTime updatedDateTime) {
        this.updatedDateTime = updatedDateTime;
        return this;
    }
    public LocalDateTime getAddedDateTime() {
        return this.addedDateTime;
    }
    
    public Project setAddedDateTime(LocalDateTime addedDateTime) {
        this.addedDateTime = addedDateTime;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public Project setName(String name) {
        this.name = name;
        return this;
    }

    public Long getProjectId() {
        return this.projectId;
    }

    public Project setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
}
