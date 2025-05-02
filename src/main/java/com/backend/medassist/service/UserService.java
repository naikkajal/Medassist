package com.backend.medassist.service;

import com.backend.medassist.dto.UserRequest;
import com.backend.medassist.model.Users;
import com.backend.medassist.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    public Users getUser(String user_id){
        Users user = userRepository.findById(user_id).orElseThrow(() -> new RuntimeException("User with user id not found"));
        return user;
    }
    public Users createUser(UserRequest userRequest){
        String userId = UUID.randomUUID().toString();
        Users newUser = Users.builder()
                .user_id(userId)
                .first_name(userRequest.getFirstName())
                .last_name(userRequest.getLastName())
                .dob(userRequest.getDob())
                .email(userRequest.getEmail())
                .mobile(userRequest.getMobile())
                .blood_group(userRequest.getBloodGroup())
                .build();
        return userRepository.save(newUser);
    }

//    public void deleteUser(String user_id){
//        userRepository.deleteById(user_id);
//    }

}
