package com.authbase.dto.response;

import lombok.Data;

import java.util.Set;

@Data
public class UserResponse {

    private String uuid;

    private String email;

    private String userName;

    private String userFirstName;

    private String userLastName;

    private Set<RoleResponse> role;

}
