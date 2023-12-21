package com.authbase.mapper;

import com.authbase.dto.response.RoleResponse;
import com.authbase.entity.Role;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface RoleMapper {

    RoleResponse toResponseDto(Role role);

}
