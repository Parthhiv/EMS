package com.exam.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.exam.model.PaperRequestModel;
import java.util.List;

public interface PaperRequestRepository extends JpaRepository<PaperRequestModel, Long> {
    List<PaperRequestModel> findByTeacherId(Long teacherId);
    List<PaperRequestModel> findBySuperintendentId(Long superintendentId);
}
