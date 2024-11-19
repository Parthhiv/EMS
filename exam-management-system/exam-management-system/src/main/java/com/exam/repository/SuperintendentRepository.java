package com.exam.repository;

import com.exam.model.SuperintendentModel;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface SuperintendentRepository extends JpaRepository<SuperintendentModel, Integer> {
    Optional<SuperintendentModel> findByIdAndPassword(Integer id, String password);
}
