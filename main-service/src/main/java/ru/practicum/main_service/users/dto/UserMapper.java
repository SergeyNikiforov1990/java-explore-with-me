package ru.practicum.main_service.users.dto;

import lombok.experimental.UtilityClass;
import ru.practicum.main_service.users.model.User;

@UtilityClass
public class UserMapper {
    public UserDto toUserDto(User user) {
    public static UserDto toUserDto(User user) {
        return UserDto.builder()
                .id(user.getId())
                .email(user.getEmail())
                .name(user.getName())
                .build();
    }
    public User toUser(NewUserRequestDto userRequestDto) {
    public static User toUser(NewUserRequestDto userRequestDto) {
        return User.builder()
                .email(userRequestDto.getEmail())
                .name(userRequestDto.getName())
                .build();
    }

}
