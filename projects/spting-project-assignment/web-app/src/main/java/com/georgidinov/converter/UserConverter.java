package com.georgidinov.converter;

import com.georgidinov.dto.UserDto;
import com.georgidinov.model.UserCredentials;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class UserConverter implements Converter<UserCredentials, UserDto> {

    @Override
    public UserDto convert(UserCredentials userCredentials) {
        UserDto dto = new UserDto();
        dto.setEmail(userCredentials.getEmail());
        dto.setPassword(userCredentials.getPassword());
        return dto;
    }
}
