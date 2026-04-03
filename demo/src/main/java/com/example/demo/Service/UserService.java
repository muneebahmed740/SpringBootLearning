package com.example.demo.Service;


import com.example.demo.Entity.User;
import com.example.demo.ExceptionHandling.UserNotFoundException;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public String registerUser(User user){
        userRepository.save(user);
        return "User Registered!";
    }

    public List<User> getAllUsers(){
        return userRepository.findAll();
    }

    public User getUserById(int id) {
        return userRepository.findById(id).orElseThrow(()->new UserNotFoundException(id));
    }
}
