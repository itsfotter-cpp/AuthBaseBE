package com.authbase.controller;

import com.authbase.dto.request.UserRequest;
import com.authbase.dto.response.UserResponse;
import com.authbase.service.impl.UserService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@AllArgsConstructor
@RequestMapping("/api/user")
public class UserController {

    private UserService userService;

    @PostMapping("/registerNewUser")
    @ResponseStatus(HttpStatus.CREATED)
    public UserResponse registerNewUser(@RequestBody @Valid UserRequest user) {
        return userService.registerNewUser(user);
    }

    @GetMapping("/forAdmin")
    @PreAuthorize("hasRole('admin')")
    @ResponseStatus(HttpStatus.OK)
    public String forAdmin() {
        return "This page is accessible only to Admin Profile";
    }

    @GetMapping("/forUser")
    @PreAuthorize("hasRole('user')")
    @ResponseStatus(HttpStatus.OK)
    public String forUser() {
        return "This page is accessible only to User Profile";
    }

}
