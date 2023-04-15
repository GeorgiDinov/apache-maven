package com.georgidinov.mapper;

import com.georgidinov.command.UserCommand;
import com.georgidinov.domain.User;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(uses = {UserMapper.class})
public interface UserMapper {

    UserMapper MAPPER = Mappers.getMapper(UserMapper.class);

    @Mapping(source = "email", target = "email")
    @Mapping(source = "password", target = "password")
    UserCommand toUserCommand(User user);

    @InheritInverseConfiguration
    User toUser(UserCommand userCommand);

}
