package com.mtn.financerecommendation.controller;


import com.mtn.financerecommendation.ApiVersion;
import com.mtn.financerecommendation.dto.InterestDto;
import com.mtn.financerecommendation.model.InterestCategory;
import com.mtn.financerecommendation.service.impl.InterestServiceImpl;
import org.modelmapper.ModelMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = ApiVersion.VERSION_1 + "/interest")
public class InterestCategoryController {

    private final InterestServiceImpl interestService;
    private final ModelMapper modelMapper;

    public InterestCategoryController(InterestServiceImpl interestService,ModelMapper modelMapper) {
        this.interestService = interestService;
        this.modelMapper = modelMapper;
    }

    @PostMapping
    public ResponseEntity<String> createInterestCategory(@RequestBody InterestDto interestDto){
        InterestCategory interestCategory = modelMapper.map(interestDto,InterestCategory.class);
        interestService.save(interestCategory);
        return ResponseEntity.ok("interest created.");
    }

}
