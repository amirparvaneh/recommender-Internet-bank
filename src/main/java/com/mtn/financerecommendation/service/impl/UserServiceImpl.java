package com.mtn.financerecommendation.service.impl;

import com.mtn.financerecommendation.repository.UserRepo;
import com.mtn.financerecommendation.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepo userRepo;

    public UserServiceImpl(UserRepo userRepo){
        this.userRepo = userRepo;
    }
}
