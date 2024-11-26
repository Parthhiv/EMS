package com.exam.service;

import com.exam.model.CoeModel;
import com.exam.model.SuperintendentModel;
import com.exam.model.TeacherModel;
import com.exam.repository.CoeRepository;
import com.exam.repository.SuperintendentRepository;
import com.exam.repository.TeacherRepository;
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
            case "teacher":
                TeacherModel teacher = teacherRepository.findById(id).orElse(null);
                return teacher != null && teacher.getPassword().equals(password);

            case "superintendent":
                SuperintendentModel superintendent = superintendentRepository.findById(id).orElse(null);
                return superintendent != null && superintendent.getPassword().equals(password);

            case "coe":
                CoeModel coe = coeRepository.findById(id).orElse(null);
                return coe != null && coe.getPassword().equals(password);
            default:
                return false;
        }
    }
}
