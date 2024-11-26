package com.exam.controller;

import com.exam.model.TeacherModel;
import com.exam.model.SuperintendentModel;
import com.exam.service.CoeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/coe")
public class CoeController {

    @Autowired
    private CoeService coeService;
    @GetMapping("")
    public String test(){
        return "OK";
    }
    @GetMapping("/teachers")
    public ResponseEntity<List<TeacherModel>> getAllTeachers() {
        List<TeacherModel> teachers = coeService.getAllTeachers();
        return new ResponseEntity<>(teachers, HttpStatus.OK);
    }

    @GetMapping("/superintendents")
    public ResponseEntity<List<SuperintendentModel>> getAllSuperintendents() {
        List<SuperintendentModel> superintendents = coeService.getAllSuperintendents();
        return new ResponseEntity<>(superintendents, HttpStatus.OK);
    }

//    @PostMapping("/assign-paper-request")
//    public ResponseEntity<String> assignPaperToTeacher(@RequestParam Long teacherId,
//                                                       @RequestParam String course,
//                                                       @RequestParam String teacherCollege) {
//        coeService.assignPaperRequestToTeacher(teacherId, course,teacherCollege);
//        return new ResponseEntity<>("Paper request assigned to teacher successfully", HttpStatus.OK);
//    }

}
