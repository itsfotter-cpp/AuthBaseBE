package com.authbase.dao;

import com.authbase.entity.Role;
import com.authbase.mapper.RoleMapper;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleDao extends JpaRepository<Role, Long> {
    Role findByRoleName(String roleName);
}
