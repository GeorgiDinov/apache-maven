package com.georgidinov.controller;

import com.georgidinov.entity.User;
import com.georgidinov.mapper.UserMapper;
import com.georgidinov.model.UserCommand;

public class UserController {


    public UserCommand saveUser(UserCommand userCommand) {
        // fake impl
        User userToSave = UserMapper.MAPPER.toUser(userCommand);
        // perform save, return saved user command
        UserCommand savedCommand = UserMapper.MAPPER.toUserCommand(userToSave);
        return savedCommand;
    }


}
