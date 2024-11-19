package com.exam.model;

import jakarta.persistence.*;

@Entity
public class PaperRequest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private CoeModel coe;

    @ManyToOne
    private TeacherModel teacher;

    @ManyToOne
    private SuperintendentModel superintendent; // Nullable initially

    private String course;
    private String semester;
    private String branch;
    private String subject;

    private String status;
}
