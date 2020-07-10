package kg.megacom.loginService.mappers;

import kg.megacom.loginService.models.dto.UserDto;
import kg.megacom.loginService.models.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserMapper {

    UserMapper INSTANSE = Mappers.getMapper(UserMapper.class);

    User userDtoToUser (UserDto userDto);
    UserDto userToUserDto(User user);

    UserDto findById(Long id);

}
