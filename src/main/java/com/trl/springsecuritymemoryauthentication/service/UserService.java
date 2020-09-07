package com.trl.springsecuritymemoryauthentication.service;

import com.trl.springsecuritymemoryauthentication.controller.dto.UserDTO;

public interface UserService {

    UserDTO getUser(Long id);
}
