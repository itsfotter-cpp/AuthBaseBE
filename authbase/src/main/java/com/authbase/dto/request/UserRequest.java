package com.authbase.dto.request;

import com.authbase.dto.response.RoleResponse;
import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.Set;

@Data
public class UserRequest {

    @NotNull
    private String userName;

    @NotNull
    private String userFirstName;

    @NotNull
    private String userLastName;

    @NotNull
    private String userPassword;

    @NotNull
    @NotEmpty
    private Set<RoleRequest> role;

}
