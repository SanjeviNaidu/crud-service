package com.demo.crud.controller;

import com.demo.crud.entity.UserEntity;
import com.demo.crud.service.UserService;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

//    Logger logger = (Logger) LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserService userService;

    @PostMapping("/add")
    public UserEntity add(@ApiParam(name = "UserEntity") @RequestBody() UserEntity user) {
        UserEntity userEntity = new UserEntity();

        try {
            userEntity = userService.add(user);
        } catch (Exception e) {
            // log error
            // implement Response object to carry error occurred to client
            e.printStackTrace(); // remove this later
        }

        return userEntity;
    }

    @PostMapping("/update")
    public UserEntity update(@ApiParam(name = "UserEntity") @RequestBody() UserEntity user) {
        UserEntity userEntity = new UserEntity();

        try {
            userEntity = userService.update(user);
        } catch (Exception e) {
            // log error
            // implement Response object to carry error occurred to client
            e.printStackTrace(); // remove this later
        }

        return userEntity;
    }

    @GetMapping("/get")
    public List<UserEntity> get(@ApiParam(name = "userId") @RequestParam(required = false) String userId) {
        List<UserEntity> userEntities = new ArrayList<>();

        try {
            userEntities = userService.get(userId);
        } catch (Exception e) {
            // log error
            // implement Response object to carry error occurred to client
            e.printStackTrace(); // remove this later
        }

        return userEntities;
    }

    @PostMapping("/delete")
    public UserEntity delete(@ApiParam(name = "UserEntity") @RequestBody() UserEntity user) {
        UserEntity userEntity = new UserEntity();

        try {
            userEntity = userService.delete(user);
        } catch (Exception e) {
            // log error
            // implement Response object to carry error occurred to client
            e.printStackTrace(); // remove this later
        }

        return userEntity;
    }

}
