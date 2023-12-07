package com.authbase.service;

import com.authbase.dao.RoleDao;
import com.authbase.dao.UserDao;
import com.authbase.dto.request.RoleRequest;
import com.authbase.dto.request.UserRequest;
import com.authbase.dto.response.UserResponse;
import com.authbase.entity.Role;
import com.authbase.entity.User;
import com.authbase.exception.ResourceConflictException;
import com.authbase.exception.ResourceNotFoundException;
import com.authbase.mapper.UserMapper;
import lombok.AllArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

import static com.authbase.util.Constants.CONFLICT_USER_EXC;

@Service
@AllArgsConstructor
public class UserService {

    private final UserDao userDao;
    private final RoleDao roleDao;
    private PasswordEncoder passwordEncoder;
    private final UserMapper userMapper;

    public UserResponse registerNewUser(UserRequest userRequest) {

        if(userDao.existsByEmailOrUserName(userRequest.getEmail(), userRequest.getUserName())) {
            throw new ResourceConflictException(CONFLICT_USER_EXC);
        }

        User user = userMapper.toDtoUserFromRequest(userRequest);
        String userPasswordEncoded = getEncodedPassword(user.getUserPassword());
        user.setUserPassword(userPasswordEncoded);
        user.setUuid(UUID.randomUUID());
        Set<Role> roleSet = new HashSet<>();
        for(RoleRequest role : userRequest.getRole()) {
            roleSet.add(roleDao.findById(role.getIdRole()).orElseThrow(() -> new ResourceNotFoundException("This role does not exist!")));
        }
        user.setRole(roleSet);
        user = userDao.save(user);

        return userMapper.toDtoResponseFromUser(user);
    }

    public String getEncodedPassword(String password) {
        return passwordEncoder.encode(password);
    }

}
