package com.trl.springsecuritymemoryauthentication.service.converter;

import com.trl.springsecuritymemoryauthentication.controller.dto.UserDTO;
import com.trl.springsecuritymemoryauthentication.repository.entity.UserEntity;

import org.springframework.stereotype.Component;

@Component
public class UserConverter {

    public static UserDTO mapEntityToDTO(UserEntity entity) {
        UserDTO resultUser = new UserDTO();

        if (entity == null) {
            throw new IllegalArgumentException("Parameter UserEntity is null !!!");
        }

        resultUser.setId(entity.getId());
        resultUser.setFirstName(entity.getFirstName());
        resultUser.setLastName(entity.getLastName());
        resultUser.setUserName(entity.getUserName());
        resultUser.setEmail(entity.getEmail());
        resultUser.setPassword(entity.getPassword());
        resultUser.setAccountNonExpired(entity.getAccountNonExpired());
        resultUser.setAccountNonLocked(entity.getAccountNonLocked());
        resultUser.setCredentialsNonExpired(entity.getCredentialsNonExpired());
        resultUser.setEnabled(entity.getEnabled());
        resultUser.setAuthorities(entity.getAuthorities());

        return resultUser;
    }
}