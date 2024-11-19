package com.exam.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.exam.model.PaperAssignmentModel;
import java.util.List;

public interface PaperAssignmentRepository extends JpaRepository<PaperAssignmentModel, Long> {

}
