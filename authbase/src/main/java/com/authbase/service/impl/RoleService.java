package com.authbase.service.impl;

import com.authbase.dao.RoleDao;
import com.authbase.dto.response.RoleResponse;
import com.authbase.entity.Role;
import com.authbase.mapper.RoleMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@AllArgsConstructor
public class RoleService {

    private final RoleDao roleDao;
    private final RoleMapper mapper;

    public RoleResponse createNewRole(Role role) {
        role.setUuid(UUID.randomUUID());
        Role roleEntity = roleDao.save(role);
        return mapper.toResponseDto(roleEntity);
    }

    public Long getRoleId(String roleName) {
        Role role = roleDao.findByRoleName(roleName);
        return role.getIdRole();
    }

}
