//package com.exam.service;
//
//import com.exam.model.PaperAssignmentModel;
//import com.exam.model.PaperSubmissionModel;
//import com.exam.model.TeacherModel;
//import com.exam.repository.PaperAssignmentRepository;
//import com.exam.repository.PaperSubmissionRepository;
//import com.exam.repository.TeacherRepository;
//import jakarta.annotation.PostConstruct;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import org.springframework.web.multipart.MultipartFile;
//
//import java.io.IOException;
//import java.util.List;
//
//@Service
//public class TeacherService {
//
//    @Autowired
//    private PaperAssignmentRepository paperAssignmentRepository;
//
//    @Autowired
//    private PaperSubmissionRepository paperSubmissionRepository;
//
//    @Autowired
//    private TeacherRepository teacherRepository;
//
//
//    public List<PaperAssignmentModel> viewAssignments() {
//        return paperAssignmentRepository.findAll();  // Retrieve all paper assignments
//    }
//
//    /**
//     * Submit a paper to the superintendent.
//     * @param teacherId The ID of the teacher submitting the paper.
//     * @param assignmentId The ID of the paper assignment the teacher is submitting.
//     * @param file The paper file to be submitted.
//     * @return The saved PaperSubmission object.
//     */
//    public PaperSubmissionModel submitPaper(Long teacherId, Long assignmentId, MultipartFile file) throws IOException {
//        PaperAssignmentModel paperAssignment = paperAssignmentRepository.findById(assignmentId).orElse(null);
//
//        if (paperAssignment != null) {
//            PaperSubmissionModel paperSubmission = new PaperSubmissionModel();
//            paperSubmission.setStudentName("Teacher " + teacherId);  // Replace with actual teacher data
//            paperSubmission.setPaperFile(file.getBytes());  // Convert the file to byte array
//
//            return paperSubmissionRepository.save(paperSubmission);  // Save paper submission
//        } else {
//            throw new RuntimeException("Assignment not found");
//        }
//    }
//}
