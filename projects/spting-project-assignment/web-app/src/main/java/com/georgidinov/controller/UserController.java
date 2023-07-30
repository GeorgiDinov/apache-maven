package com.georgidinov.controller;

import com.georgidinov.bootstrap.DummyUserLoader;
import com.georgidinov.converter.UserConverter;
import com.georgidinov.dto.UserDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class UserController {

    private final DummyUserLoader loader;
    private final UserConverter converter;

    public UserController(DummyUserLoader loader, UserConverter converter) {
        this.loader = loader;
        this.converter = converter;
    }

    @GetMapping("/users")
    public List<UserDto> getUsers() {
        return loader.getUsers().stream().map(converter::convert).collect(Collectors.toList());
    }

}