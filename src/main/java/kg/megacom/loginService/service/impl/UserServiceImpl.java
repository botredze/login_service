package kg.megacom.loginService.service.impl;

import kg.megacom.loginService.database.UserRepository;
import kg.megacom.loginService.exeptions.UserNotFound;
import kg.megacom.loginService.mappers.UserMapper;
import kg.megacom.loginService.models.dto.UserDto;
import kg.megacom.loginService.models.entity.User;
import kg.megacom.loginService.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDto save(UserDto userDto) {
        User user = UserMapper.INSTANSE.userDtoToUser(userDto);
        userRepository.save(user);
        userDto =UserMapper.INSTANSE.userToUserDto(user);
        return userDto;
    }

    @Override
    public UserDto update(UserDto userDto) {
        return null;
    }

    @Override
    public void deleteById(Long id) {
        userRepository.deleteById(id);
    }

    @Override
    public UserDto getById(Long id) {
        userRepository.findById(id).orElse(null);
        if(id==null){
            throw  new UserNotFound("Пользователь не найден");
        }
        return UserMapper.INSTANSE.findById(id);
    }

    @Override
    public List<UserDto> findAllUsers() {
        return userRepository.findAll()
                .stream()
                .map(UserMapper.INSTANSE::userToUserDto)
                .collect(Collectors.toList());
    }
}
