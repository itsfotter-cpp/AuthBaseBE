package com.authbase.mapper;

import com.authbase.dto.request.RoleRequest;
import com.authbase.dto.request.UserRequest;
import com.authbase.dto.response.RoleResponse;
import com.authbase.dto.response.UserResponse;
import com.authbase.entity.Role;
import com.authbase.entity.User;
import java.util.LinkedHashSet;
import java.util.Set;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-12-05T11:43:08+0100",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 11 (Oracle Corporation)"
)
@Component
public class UserMapperImpl implements UserMapper {

    @Override
    public UserResponse toDtoResponseFromUser(User user) {
        if ( user == null ) {
            return null;
        }

        UserResponse userResponse = new UserResponse();

        if ( user.getUuid() != null ) {
            userResponse.setUuid( user.getUuid().toString() );
        }
        userResponse.setUserName( user.getUserName() );
        userResponse.setRole( roleSetToRoleResponseSet( user.getRole() ) );

        return userResponse;
    }

    @Override
    public User toDtoUserFromRequest(UserRequest userRequest) {
        if ( userRequest == null ) {
            return null;
        }

        User user = new User();

        user.setUserName( userRequest.getUserName() );
        user.setUserFirstName( userRequest.getUserFirstName() );
        user.setUserLastName( userRequest.getUserLastName() );
        user.setUserPassword( userRequest.getUserPassword() );
        user.setRole( roleRequestSetToRoleSet( userRequest.getRole() ) );

        return user;
    }

    protected RoleResponse roleToRoleResponse(Role role) {
        if ( role == null ) {
            return null;
        }

        RoleResponse roleResponse = new RoleResponse();

        if ( role.getUuid() != null ) {
            roleResponse.setUuid( role.getUuid().toString() );
        }
        roleResponse.setRoleName( role.getRoleName() );

        return roleResponse;
    }

    protected Set<RoleResponse> roleSetToRoleResponseSet(Set<Role> set) {
        if ( set == null ) {
            return null;
        }

        Set<RoleResponse> set1 = new LinkedHashSet<RoleResponse>( Math.max( (int) ( set.size() / .75f ) + 1, 16 ) );
        for ( Role role : set ) {
            set1.add( roleToRoleResponse( role ) );
        }

        return set1;
    }

    protected Role roleRequestToRole(RoleRequest roleRequest) {
        if ( roleRequest == null ) {
            return null;
        }

        Role role = new Role();

        role.setIdRole( roleRequest.getIdRole() );

        return role;
    }

    protected Set<Role> roleRequestSetToRoleSet(Set<RoleRequest> set) {
        if ( set == null ) {
            return null;
        }

        Set<Role> set1 = new LinkedHashSet<Role>( Math.max( (int) ( set.size() / .75f ) + 1, 16 ) );
        for ( RoleRequest roleRequest : set ) {
            set1.add( roleRequestToRole( roleRequest ) );
        }

        return set1;
    }
}
