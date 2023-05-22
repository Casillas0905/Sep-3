package com.ServerSep3.Server.Controller;

import com.ServerSep3.Server.Model.UserModel;
import com.ServerSep3.Server.Service.UserService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<UserModel> findAllUsers() {
        return userService.findAllUsers();
    }

    @GetMapping("/id/{id}")
    public UserModel findById(@PathVariable("id")int id) {
        return userService.findById(id);
    }

    @PostMapping("/save")
    public UserModel saveUser(@RequestBody UserModel user) {
        return userService.saveUser(user);
    }

    @PostMapping("/update")
    public UserModel updateUser(@RequestBody UserModel user){return userService.updateUser(user);}

    @GetMapping("/delete/{id}")
    public void deleteUser(@PathVariable("id")long id){userService.deleteUser(id);}

    @GetMapping("/getByUsername/{username}")
    public UserModel getByUsername(@PathVariable("username")String user){
        return userService.findByUsername(user);
    }
}
