package com.georgidinov.mapper;


import com.georgidinov.entity.User;
import com.georgidinov.model.UserCommand;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(uses = {UserMapper.class})
public interface UserMapper {

    UserMapper MAPPER = Mappers.getMapper(UserMapper.class);

    @Mapping(source = "firstName", target = "firstName")
    @Mapping(source = "lastName", target = "lastName")
    @Mapping(source = "email", target = "email")
    UserCommand toUserCommand(User user);

    @InheritInverseConfiguration
    User toUser(UserCommand userCommand);

}