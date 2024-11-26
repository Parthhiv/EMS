package com.exam.service;

import com.exam.model.PaperRequestModel;
import com.exam.repository.PaperRequestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PaperRequestService {

    @Autowired
    private PaperRequestRepository paperRequestRepository;

    public void createRequest(PaperRequestModel request) {
        paperRequestRepository.save(request);
    }
//    public List<PaperRequestModel> getRequestsForTeacher(Long teacherId) {
//        return paperRequestRepository.findByTeacher_Id(teacherId);
//    }
//
//    public List<PaperRequestModel> getRequestsForSuperintendent(Long superintendentId) {
//        return paperRequestRepository.findBySuperintendent_Id(superintendentId);
//    }
//
//    public void updateRequest(PaperRequestModel updatedRequest) {
//        paperRequestRepository.save(updatedRequest);
//    }
//

}
