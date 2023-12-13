package com.authbase.service.impl;

import com.authbase.dao.RoleDao;
import com.authbase.entity.Role;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@AllArgsConstructor
public class RoleService {

    private final RoleDao roleDao;

    public Role createNewRole(Role role) {
        role.setUuid(UUID.randomUUID());
       return roleDao.save(role);
    }

}
