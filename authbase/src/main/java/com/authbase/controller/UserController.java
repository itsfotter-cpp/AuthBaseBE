package com.authbase.controller;

import com.authbase.entity.User;
import com.authbase.service.UserService;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class UserController {

    private UserService userService;

    @PostMapping("/registerNewUser")
    public User registerNewUser(@RequestBody User user) {
        return userService.registerNewUser(user);
    }

    @GetMapping("/forAdmin")
    @PreAuthorize("hasRole('admin')")
    public String forAdmin() {
        return "ADMIN";
    }

    @GetMapping("/forUser")
    @PreAuthorize("hasRole('user')")
    public String forUser() {
        return "USER";
    }

}
