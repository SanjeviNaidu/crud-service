package com.demo.crud.service.impl;

import com.demo.crud.repository.UserRepository;
import com.demo.crud.entity.UserEntity;
import com.demo.crud.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserEntity add(UserEntity user) {
        return userRepository.save(user);
    }

    @Override
    public UserEntity update(UserEntity user) {
        return userRepository.save(user);
    }

    @Override
    public List<UserEntity> get(String userId) {
        List<UserEntity> userEntities = userRepository.findAll();

        if (ObjectUtils.isEmpty(userId)) {
            return userEntities;
        } else {
            return userEntities
                    .stream()
                    .filter(userEntity -> userEntity.getUserId().equals(userId))
                    .collect(Collectors.toList());
        }
    }

    @Override
    public UserEntity delete(UserEntity user) {
        userRepository.delete(user);
        return user;
    }
}
