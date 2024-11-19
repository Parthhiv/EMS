//package com.exam.service;
//
//import com.exam.model.PaperSubmissionModel;
//import com.exam.repository.PaperSubmissionRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import java.util.List;
//
//@Service
//public class SuperintendentService {
//
//    @Autowired
//    private PaperSubmissionRepository paperSubmissionRepository;
//
//    /**
//     * View all paper submissions received by the superintendent.
//     * @return A list of all paper submissions.
//     */
//    public List<PaperSubmissionModel> viewSubmittedPapers() {
//        return paperSubmissionRepository.findAll();  // Retrieve all paper submissions
//    }
//
//    /**
//     * Get a paper submission by ID.
//     * @param id The ID of the paper submission.
//     * @return The PaperSubmission object.
//     */
//    public PaperSubmissionModel getSubmissionById(Long id) {
//        return paperSubmissionRepository.findById(id).orElse(null);
//    }
//}
