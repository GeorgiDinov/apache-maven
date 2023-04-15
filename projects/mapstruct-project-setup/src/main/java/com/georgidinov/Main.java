package com.georgidinov;

import com.georgidinov.command.UserCommand;
import com.georgidinov.domain.User;
import com.georgidinov.mapper.UserMapper;

public class Main {

    public static void main(String[] args) {
        User user = new User("example@email.com", "password");
        System.out.println("Created user = " + user);
        UserCommand userCommand = UserMapper.MAPPER.toUserCommand(user);
        System.out.println("Created command = " + userCommand);
    }

}