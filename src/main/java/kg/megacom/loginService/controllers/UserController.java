package kg.megacom.loginService.controllers;

import kg.megacom.loginService.models.dto.UserDto;
import kg.megacom.loginService.service.UserService;
import kg.megacom.loginService.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping(value = "/v1/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/save")
    public UserDto save (@RequestHeader("auth") String auth, @RequestBody UserDto userDto){
        return userService.save(userDto);
    }

    @PutMapping("/update")
    public UserDto update(@RequestHeader("auth") String auth, @RequestBody UserDto userDto){
        return null;
    }

   // @DeleteMapping("/delete/{id}")
    //public boolean delete(@RequestHeader("auth") String auth, @PathVariable Long id){
      //  return userService.deleteById(id);
    //}

    @GetMapping("/find/{id}")
    public  UserDto getById(@RequestHeader("auth") String auth, @PathVariable Long id){
        return userService.getById(id);
    }

    @GetMapping("/all")
    public List<UserDto>findAllUsers(@RequestHeader("auth") String auth ){
        return userService.findAllUsers();
    }

}
