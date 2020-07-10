package kg.megacom.loginService.service;

import kg.megacom.loginService.models.dto.UserDto;

import java.util.List;

public interface UserService {

    UserDto save(UserDto userDto);

    UserDto update(UserDto userDto);

  void deleteById(Long id);

    UserDto getById(Long id);

    List<UserDto> findAllUsers();
}
