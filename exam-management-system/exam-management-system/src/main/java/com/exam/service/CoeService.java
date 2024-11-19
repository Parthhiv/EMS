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
    private PaperAssignmentRepository paperAssignmentRepository;

    @Autowired
    private CoeRepository coeRespository;

    @Autowired
    private TeacherRepository teacherRepository;

    @Autowired
    private SuperintendentRepository superintendentRespository;

    @Autowired
    private PaperSubmissionRepository paperSubmittedRepository;

    @PostConstruct
    public void init() {
        // Adding hardcoded details when the application starts

        if (teacherRepository.count() == 0) {  // Check if no teachers exist
            TeacherModel teacher1 = new TeacherModel();
            teacher1.setName("Lokesh");
            teacher1.setId(15);
            teacher1.setPassword("123");
            teacher1.setName("lokesheripuk@gmail.com");


            TeacherModel teacher2 = new TeacherModel();
            teacher2.setName("Aditya Reddy");
            teacher2.setId(35);
            teacher2.setPassword("123");
            teacher2.setEmail("adireddyeripuk@gmail.com");


            teacherRepository.save(teacher1);
            teacherRepository.save(teacher2);
        }

        if(superintendentRespository.count()==0){
            SuperintendentModel s1 = new SuperintendentModel();
            s1.setName("Eshwar");
            s1.setId(37);
            s1.setPassword("123");

            SuperintendentModel s2 = new SuperintendentModel();

            s2.setName("Shemmu");
            s2.setId(123);
            s2.setPassword("123");

            superintendentRespository.save(s1);
            superintendentRespository.save(s2);
        }
        if(coeRespository.count()==0){
            CoeModel c = new CoeModel();
            c.setId(123);
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


//    public List<PaperAssignmentModel> getAllAssignments() {
//        return paperAssignmentRepository.findAll();  // Retrieve all paper assignments
//    }
//    public PaperAssignmentModel getAssignmentById(Long id) {
//        return paperAssignmentRepository.findById(id).orElse(null);
//    }
//    public PaperAssignmentModel assignPaperRequestToTeacher(Long teacherId, String course, String college) {
//        // Find the teacher by ID
//        TeacherModel teacher = teacherRepository.findById(teacherId).orElse(null);
//
//        if (teacher == null) {
//            throw new RuntimeException("Teacher not found with ID: " + teacherId);
//        }
//
//        // Create a new PaperAssignmentModel
//        PaperAssignmentModel paperAssignment = new PaperAssignmentModel();
//        paperAssignment.setCourse(course);
//        paperAssignment.setCollege(college);
//        paperAssignment.setTeacherId(teacherId);
//
//
//        // Save the paper assignment
//        return paperAssignmentRepository.save(paperAssignment);
//    }


//    public List<PaperSubmissionModel> getAllSubmittedPapers() {
//        return paperSubmittedRepository.findAll();
//    }
//
//    public void assignPaperToSuperintendent(Long submissionId, Long superintendentId,String College) {
//
//    }


}
