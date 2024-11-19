package com.exam.service;

import com.exam.model.CoeModel;
import com.exam.model.TeacherModel;
import com.exam.model.SuperintendentModel;
import com.exam.repository.CoeRepository;
import com.exam.repository.TeacherRepository;
import com.exam.repository.SuperintendentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    @Autowired
    private CoeRepository coeRepository;

    @Autowired
    private TeacherRepository teacherRepository;

    @Autowired
    private SuperintendentRepository superintendentRepository;

    public boolean authenticate(String role, Long id, String password) {
        switch (role.toLowerCase()) {
            case "coe":
                return coeRepository.findByIdAndPassword(id, password).isPresent();
            case "teacher":
                return teacherRepository.findByIdAndPassword(id.intValue(), password).isPresent();
            case "superintendent":
                return superintendentRepository.findByIdAndPassword(id.intValue(), password).isPresent();
            default:
                return false;
        }
    }
}
