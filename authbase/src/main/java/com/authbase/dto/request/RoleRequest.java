package com.authbase.dto.request;

import lombok.Data;

import javax.persistence.Id;

@Data
public class RoleRequest {

    @Id
    private Long idRole;

}
