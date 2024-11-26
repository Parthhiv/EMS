package com.exam.model;

import jakarta.persistence.*;

@Entity
public class PaperRequestModel {

    @Id
    private Long id;

//    private CoeModel coe;

    private Long teacherId;

    private Long superintendentId; // Nullable initially

    private String course;
    private String semester;
    private String branch;
    private String subject;

    private String status;

    @Lob
    private byte[] paper; // Binary data for the paper file

    // Getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Long teacherId) {
        this.teacherId = teacherId;
    }

    public Long getSuperintendentId() {
        return superintendentId;
    }

    public void setSuperintendentId(Long superintendentId) {
        this.superintendentId = superintendentId;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public byte[] getPaper() {
        return paper;
    }

    public void setPaper(byte[] paper) {
        this.paper = paper;
    }
}
