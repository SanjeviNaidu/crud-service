package com.demo.crud.service;

import com.demo.crud.entity.UserEntity;
import org.springframework.stereotype.Service;

import java.util.List;

public interface UserService {

    UserEntity add(UserEntity user);

    UserEntity update(UserEntity user);

    List<UserEntity> get(String userId);

    UserEntity delete(UserEntity user);

}
