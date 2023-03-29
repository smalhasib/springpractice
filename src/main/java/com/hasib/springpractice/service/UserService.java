package com.hasib.springpractice.service;

import com.hasib.springpractice.dto.RegistrationDto;
import com.hasib.springpractice.models.UserEntity;

public interface UserService {
    void saveUser(RegistrationDto registrationDto);

    UserEntity findByEmail(String email);

    UserEntity findByUsername(String username);
}
