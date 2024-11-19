package com.exam.model;

import jakarta.persistence.*;

@Entity
public class PaperAssignmentModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String course;

    private String college;

    private boolean verificationStatus;

    @Lob
    private byte[] filePath;  // Stores the paper file as binary data

    // Getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public byte[] getFilePath() {
        return filePath;
    }

    public void setFilePath(byte[] filePath) {
        this.filePath = filePath;
    }

    public void setTeacherId(Long teacherId) {
        this.id = teacherId;
    }

    public void setVerificationStatus(boolean status) {
        this.verificationStatus = status;
    }

    public void setCollege(String college) {
        this.college = college;
    }
}
