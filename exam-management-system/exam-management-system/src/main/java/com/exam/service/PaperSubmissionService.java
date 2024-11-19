//package com.exam.service;
//
//import com.exam.model.PaperSubmissionModel;
//import com.exam.repository.PaperSubmissionRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import org.springframework.web.multipart.MultipartFile;
//
//import java.io.IOException;
//import java.util.List;
//
//@Service
//public class PaperSubmissionService {
//
//    @Autowired
//    private PaperSubmissionRepository paperSubmissionRepository;
//
//    /**
//     * Upload a student's paper submission.
//     * @param studentId The ID of the student.
//     * @param file The file that the student is submitting.
//     * @return The saved PaperSubmission object.
//     */
//    public PaperSubmissionModel uploadPaper(Long studentId, MultipartFile file) throws IOException {
//        // Create a new PaperSubmission instance
//        PaperSubmissionModel paperSubmission = new PaperSubmissionModel();
//        paperSubmission.setStudentName("Student " + studentId);  // Example, replace with actual student data if needed
//        paperSubmission.setPaperFile(file.getBytes());  // Convert the file to byte array
//
//        // Save the paper submission to the repository
//        return paperSubmissionRepository.save(paperSubmission);
//    }
//
//    /**
//     * Get a Paper Submission by ID.
//     *
//     * @param id The ID of the PaperSubmission.
//     * @return The PaperSubmission object.
//     */
//    public PaperSubmissionModel getSubmissionById(Long id) {
//        return paperSubmissionRepository.findById(id).orElse(null);
//    }
//
//    /**
//     * List all Paper Submissions.
//     *
//     * @return A list of all PaperSubmissions.
//     */
//    public List<PaperSubmissionModel> getAllSubmissions() {
//        return paperSubmissionRepository.findAll();
//    }
//}
