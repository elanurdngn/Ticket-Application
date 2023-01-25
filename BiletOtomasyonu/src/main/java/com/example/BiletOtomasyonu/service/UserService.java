package com.example.BiletOtomasyonu.service;

import com.example.BiletOtomasyonu.entity.Ticket;
import com.example.BiletOtomasyonu.entity.User;
import com.example.BiletOtomasyonu.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public User saveUser(User user){
        return userRepository.save(user);
    }

    public User updateUser(User user){
        return userRepository.save(user);
    }

    public void deleteUserById(Long userId){userRepository.deleteById(userId);
    }
}
