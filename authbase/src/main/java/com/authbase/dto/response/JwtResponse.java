package com.authbase.dto.response;

import com.authbase.entity.User;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class JwtResponse {

    private UserResponse user;

    private String jwtToken;

}
