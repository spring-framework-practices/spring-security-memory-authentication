package com.trl.springsecuritymemoryauthentication.service.impl;

import com.trl.springsecuritymemoryauthentication.controller.dto.UserDTO;
import com.trl.springsecuritymemoryauthentication.service.UserService;

import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public UserDTO getUser(Long id) {
        return null;
    }
}
