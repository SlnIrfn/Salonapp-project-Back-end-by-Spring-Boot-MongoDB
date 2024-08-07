package com.salonappbackend.Salon.App.Backend.Project.Services;

import com.salonappbackend.Salon.App.Backend.Project.repository.UserRepository;
import com.salonappbackend.Salon.App.Backend.Project.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void registerUser(User user){
        userRepository.save(user);
    }
}
