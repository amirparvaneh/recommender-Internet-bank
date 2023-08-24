package com.mtn.financerecommendation.service;


import com.mtn.financerecommendation.model.InterestCategory;

import java.util.List;

public interface InterestService extends BaseService<InterestCategory>{

    List<InterestCategory> findAll();

}
