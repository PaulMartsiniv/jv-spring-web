package mate.academy.spring.service.mapper;

import mate.academy.spring.model.User;
import mate.academy.spring.model.dto.UserResponseDto;
import org.springframework.stereotype.Component;

@Component
public class UserDtoMapper {
    public UserResponseDto parse(User user) {
        return UserResponseDto.builder().id(user.getId())
                .name(user.getName()).lastName(user.getLastName()).build();
    }
}