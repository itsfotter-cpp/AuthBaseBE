package com.authbase.controller;

import com.authbase.dto.response.RoleResponse;
import com.authbase.entity.Role;
import com.authbase.service.impl.RoleService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("/api/role")
public class RoleController {

    private RoleService roleService;

    @PostMapping("/createNewRole")
    @ResponseStatus(HttpStatus.CREATED)
    public RoleResponse createNewRole(@RequestBody Role role) {
        return roleService.createNewRole(role);
    }

    @GetMapping("/role-by-name")
    @ResponseStatus(HttpStatus.OK)
    public Long getRoleByName(@RequestParam("roleName") String roleName) {
        return roleService.getRoleId(roleName);
    }

}
