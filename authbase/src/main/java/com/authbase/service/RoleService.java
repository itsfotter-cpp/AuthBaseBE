package com.authbase.service;

import com.authbase.dao.RoleDao;
import com.authbase.entity.Role;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class RoleService {

    private final RoleDao roleDao;

    public Role createNewRole(Role role) {
       return roleDao.save(role);
    }

}
