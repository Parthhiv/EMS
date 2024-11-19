package com.exam.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.exam.model.PaperSubmissionModel;

public interface PaperSubmissionRepository extends JpaRepository<PaperSubmissionModel, Long> {
}
