package com.backend.medassist.controller;

import com.backend.medassist.dto.UserRequest;
import com.backend.medassist.model.Users;
import com.backend.medassist.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("api/users")
public class UserController {
    @Autowired
    UserService userService;
    @GetMapping("/{user_id}")
    public Users getUser(@PathVariable String user_id){
        return userService.getUser(user_id);
    }
    @PostMapping
    public Users createUser(@RequestBody UserRequest request){
        return userService.createUser(request);
    }


//    @DeleteMapping("/{user_id}")
//    public void deleteUser(@PathVariable String user_id){
//        userService.deleteUser(user_id);
//    }
}
