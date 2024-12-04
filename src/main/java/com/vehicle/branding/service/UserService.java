package com.vehicle.branding.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vehicle.branding.entity.User;
import com.vehicle.branding.respository.UserRepository;
// import com.vehicle.branding.respository.UserReposity;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User registerUser(User user){

        return userRepository.save(user);

    }

    
    
}
