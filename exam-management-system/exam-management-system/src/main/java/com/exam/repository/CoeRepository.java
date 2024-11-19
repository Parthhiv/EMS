package com.exam.repository;

import com.exam.model.CoeModel;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface CoeRepository extends JpaRepository<CoeModel, Long> {
    Optional<CoeModel> findByIdAndPassword(Long id, String password);
}
