package vn.hoidanit.jobhunter.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import vn.hoidanit.jobhunter.domain.User;
import vn.hoidanit.jobhunter.service.UserService;

@RestController
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    /** ユーザを登録する */
    @GetMapping("/user/create")
    public String createNewUser() {
        User user = new User();
        user.setEmail("example@gmail.com");
        user.setName("dao");
        user.setPassword("123456");
        userService.registerUser(user);
        return "create user";
    }

}
