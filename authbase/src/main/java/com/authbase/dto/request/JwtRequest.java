package com.authbase.dto.request;

import com.sun.istack.NotNull;
import lombok.Data;

@Data
public class JwtRequest {

    @NotNull
    private String userName;

    @NotNull
    private String userPassword;

}
