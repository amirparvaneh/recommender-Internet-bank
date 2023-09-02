package com.mtn.financerecommendation.service.impl;

import com.mtn.financerecommendation.constants.ErrorMessage;
import com.mtn.financerecommendation.exception.EntityNotFoundException;
import com.mtn.financerecommendation.model.InterestCategory;
import com.mtn.financerecommendation.repository.InterestRepo;
import com.mtn.financerecommendation.service.InterestService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;



@Service
@RequiredArgsConstructor
public class InterestServiceImpl implements InterestService {

    private final InterestRepo interestRepo;

    @Override
    public List<InterestCategory> findAll() {
        return interestRepo.findAll();
    }

    @Override
    public void save(InterestCategory interestCategory) {
        interestRepo.save(interestCategory);
    }

    @Override
    public void delete(InterestCategory interestCategory) {
        interestRepo.delete(interestCategory);
    }

    @Override
    public InterestCategory find(Long interestId) {
        return interestRepo.findById(interestId).orElseThrow(() ->
                new EntityNotFoundException(ErrorMessage.Error_For_Interest_Not_Found + interestId));
    }


}
