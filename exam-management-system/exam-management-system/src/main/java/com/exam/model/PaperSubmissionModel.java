package com.exam.model;

import jakarta.persistence.*;

@Entity
public class PaperSubmissionModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String studentName;

    // Store file as binary data (byte array)
    @Lob
    private byte[] paperFile;  // The actual file content (PDF, DOC, etc.)

    // Getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public byte[] getPaperFile() {
        return paperFile;
    }

    public void setPaperFile(byte[] paperFile) {
        this.paperFile = paperFile;
    }

    public void setPaperAssignment(PaperAssignmentModel paperAssignment) {

    }

    public void setPaperContent(byte[] paperContent) {
    }

    public void setSubmittedAt(long l) {
    }
}
