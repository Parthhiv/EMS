//package com.exam.service;
//
//import com.exam.model.PaperAssignmentModel;
//import com.exam.model.PaperSubmissionModel;
//import com.exam.repository.PaperAssignmentRepository;
//import com.exam.repository.PaperSubmissionRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//public class PaperVerificationService {
//
//    @Autowired
//    private PaperAssignmentRepository paperAssignmentRepository;
//
//    @Autowired
//    private PaperSubmissionRepository paperSubmissionRepository;
//
//    // Method to verify paper submission by teacher
//    public PaperAssignmentModel verifyPaper(Long paperAssignmentId, boolean isVerified) {
//        // Fetch the paper assignment using the provided paper assignment ID
//        PaperAssignmentModel paperAssignment = paperAssignmentRepository.findById(paperAssignmentId)
//                .orElseThrow(() -> new RuntimeException("Paper Assignment not found"));
//
//        // Update the verification status based on the input
//        if (isVerified) {
//            paperAssignment.setVerificationStatus(true);
//        } else {
//            paperAssignment.setVerificationStatus(false);
//        }
//
//        // Save the updated paper assignment in the repository
//        return paperAssignmentRepository.save(paperAssignment);
//    }
//
//    // Method to submit a paper by a teacher
//    public PaperSubmissionModel submitPaper(Long paperAssignmentId, byte[] paperContent) {
//        // Fetch the paper assignment using the paperAssignmentId
//        PaperAssignmentModel paperAssignment = paperAssignmentRepository.findById(paperAssignmentId)
//                .orElseThrow(() -> new RuntimeException("Paper Assignment not found"));
//
//        // Create a new PaperSubmission
//        PaperSubmissionModel paperSubmission = new PaperSubmissionModel();
//        paperSubmission.setPaperAssignment(paperAssignment);
//        paperSubmission.setPaperContent(paperContent);
//        paperSubmission.setSubmittedAt(System.currentTimeMillis());
//
//        // Save the paper submission to the repository
//        return paperSubmissionRepository.save(paperSubmission);
//    }
//
//    // Method to get all papers for a particular teacher
//    public List<PaperAssignmentModel> getAllAssignedPapers(Long teacherId) {
//        return paperAssignmentRepository.findByTeacherId(teacherId);
//    }
//}
