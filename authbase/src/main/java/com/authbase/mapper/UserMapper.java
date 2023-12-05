package com.authbase.mapper;

import com.authbase.dto.request.UserRequest;
import com.authbase.dto.response.UserResponse;
import com.authbase.entity.User;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Component
@Mapper(componentModel = "spring")
public interface UserMapper {

    UserResponse toDtoResponseFromUser(User user);
    User toDtoUserFromRequest(UserRequest userRequest);

}
