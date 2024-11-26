package com.exam.service;

import com.exam.model.*;
import com.exam.repository.*;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CoeService {

    @Autowired
    private CoeRepository coeRespository;

    @Autowired
    private TeacherRepository teacherRepository;

    @Autowired
    private SuperintendentRepository superintendentRespository;


    @PostConstruct
    public void init() {
        // Adding hardcoded details when the application starts

        if (teacherRepository.count() == 0) {  // Check if no teachers exist
            TeacherModel teacher1 = new TeacherModel();
            teacher1.setName("Lokesh");
            teacher1.setId(15L);
            teacher1.setPassword("123");
            teacher1.setEmail("lokesheripuk@gmail.com");

            teacherRepository.save(teacher1);
        }

        if(superintendentRespository.count()==0){
            SuperintendentModel s1 = new SuperintendentModel();
            s1.setName("Eshwar");
            s1.setId(37L);
            s1.setPassword("123");

            SuperintendentModel s2 = new SuperintendentModel();

            s2.setName("Shemmu");
            s2.setId(123L);
            s2.setPassword("123");

            superintendentRespository.save(s1);
            superintendentRespository.save(s2);
        }
        if(coeRespository.count()==0){
            CoeModel c = new CoeModel();
            c.setId(123L);
            c.setPassword("123");
            c.setEmail("parthivpatel015@gmail.com");
            coeRespository.save(c);
        }
    }

    public List<TeacherModel> getAllTeachers() {
        return teacherRepository.findAll();
    }

    public List<SuperintendentModel> getAllSuperintendents() {
        return superintendentRespository.findAll();
    }



}
