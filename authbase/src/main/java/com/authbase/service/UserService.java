package com.authbase.service;

import com.authbase.dao.RoleDao;
import com.authbase.dao.UserDao;
import com.authbase.entity.Role;
import com.authbase.entity.User;
import lombok.AllArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@AllArgsConstructor
public class UserService {

    private final UserDao userDao;
    private final RoleDao roleDao;
    private PasswordEncoder passwordEncoder;

    public User registerNewUser(User user) {
        String userPasswordEncoded = getEncodedPassword(user.getUserPassword());
        user.setUserPassword(userPasswordEncoded);
        Set<Role> roleSet = new HashSet<>();
        for(Role role : user.getRole()) {
            roleSet.add(roleDao.findById(role.getRoleName()).get());
        }
        user.setRole(roleSet);
        return userDao.save(user);
    }

    public String getEncodedPassword(String password) {
        return passwordEncoder.encode(password);
    }

}
