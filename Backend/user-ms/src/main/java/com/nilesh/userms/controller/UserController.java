package com.nilesh.userms.controller;

import com.nilesh.userms.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/user-api")
public class UserController {
    @Autowired
    private UserService userService;

    @Autowired
    private Environment environment;

}
