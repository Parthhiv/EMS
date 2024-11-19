package com.exam.repository;

import com.exam.model.PaperVerificationModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaperVerificationRepository extends JpaRepository<PaperVerificationModel, Long> {
}
