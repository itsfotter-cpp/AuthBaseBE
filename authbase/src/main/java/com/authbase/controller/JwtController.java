package com.authbase.controller;

import com.authbase.dto.request.JwtRequest;
import com.authbase.dto.response.JwtResponse;
import com.authbase.service.JwtService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@CrossOrigin
@AllArgsConstructor
@RequestMapping("/api")
public class JwtController {

    private JwtService jwtService;

    @PostMapping("/authenticate")
    public JwtResponse createJwtToken(@RequestBody @Valid JwtRequest jwtRequest) throws Exception {
        return jwtService.createJwtToken(jwtRequest);
    }

}
