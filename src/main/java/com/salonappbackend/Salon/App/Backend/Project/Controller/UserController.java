package com.salonappbackend.Salon.App.Backend.Project.Controller;

import com.salonappbackend.Salon.App.Backend.Project.Services.UserService;
import com.salonappbackend.Salon.App.Backend.Project.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    private UserService userService;

    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping("/Signup")
    public ResponseEntity<String> signup(@Valid @RequestBody User user) {
        userService.registerUser(user);
        return new ResponseEntity<>("User Registered Successfully", HttpStatus.CREATED);
    }
}
