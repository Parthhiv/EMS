package com.exam.repository;

import com.exam.model.TeacherModel;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface TeacherRepository extends JpaRepository<TeacherModel, Integer> {
    Optional<TeacherModel> findByIdAndPassword(Integer id, String password);
}
