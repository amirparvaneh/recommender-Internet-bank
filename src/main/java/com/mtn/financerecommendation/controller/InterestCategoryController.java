package com.mtn.financerecommendation.controller;


import com.mtn.financerecommendation.ApiVersion;
import com.mtn.financerecommendation.dto.InterestRequestDto;
import com.mtn.financerecommendation.dto.mapper.InterestMapper;
import com.mtn.financerecommendation.model.InterestCategory;
import com.mtn.financerecommendation.service.impl.InterestServiceImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = ApiVersion.VERSION_1 + "/interest")
public class InterestCategoryController {

    private final InterestServiceImpl interestService;

    public InterestCategoryController(InterestServiceImpl interestService) {
        this.interestService = interestService;
    }

    @PostMapping
    public ResponseEntity<String> createInterestCategory(@RequestBody InterestRequestDto interestRequestDto){
        InterestCategory interestCategory = InterestMapper.INSTANCE.interestReqDtoToInterest(interestRequestDto);
        interestService.save(interestCategory);
        return ResponseEntity.ok("interest created.");
    }

    @GetMapping(value = "/all")
    public ResponseEntity<List<InterestCategory>> getAllInterestRate(){
        List<InterestCategory> interestCategories = interestService.findAll();
        return ResponseEntity.ok(interestCategories);
    }
}
