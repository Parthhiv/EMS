//package com.exam.service;
//
//import com.exam.model.PaperAssignmentModel;
//import com.exam.repository.PaperAssignmentRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import org.springframework.web.multipart.MultipartFile;
//
//import java.io.IOException;
//import java.util.List;
//
//@Service
//public class PaperAssignmentService {
//
//    @Autowired
//    private PaperAssignmentRepository paperAssignmentRepository;
//
//    /**
//     * Create a new paper assignment.
//     * @param course The course for which the paper is assigned.
//     * @param requestedBy The person who requested the paper (e.g., COE).
//     * @param file The paper file to be uploaded (in byte array format).
//     * @return The created PaperAssignment object.
//     */
//    public PaperAssignmentModel createAssignment(String course, String requestedBy, MultipartFile file) throws IOException {
//        // Create a new PaperAssignment instance
//        PaperAssignmentModel paperAssignment = new PaperAssignmentModel();
//        paperAssignment.setCourse(course);
//
//        paperAssignment.setFilePath(file.getBytes());  // Convert the file to byte array
//
//        // Save the assignment to the repository
//        return paperAssignmentRepository.save(paperAssignment);
//    }
//
//    /**
//     * Get a Paper Assignment by ID.
//     *
//     * @param id The ID of the PaperAssignment.
//     * @return The PaperAssignment object.
//     */
//    public PaperAssignmentModel getAssignmentById(Long id) {
//        return paperAssignmentRepository.findById(id).orElse(null);
//    }
//
//    /**
//     * List all Paper Assignments.
//     *
//     * @return A list of all PaperAssignments.
//     */
//    public List<PaperAssignmentModel> getAllAssignments() {
//        return paperAssignmentRepository.findAll();
//    }
//}
