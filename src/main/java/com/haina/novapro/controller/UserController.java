package com.haina.novapro.controller;

import com.haina.novapro.common.Result;
import com.haina.novapro.dto.RegisterRequest;
import com.haina.novapro.entity.User;
import com.haina.novapro.service.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")
public class UserController {
    private UserService userService;
    public UserController(UserService userService){
        this.userService = userService;
    }

    @PostMapping("/register")
    public Result<?> register(@RequestBody RegisterRequest request){
        User user = userService.Register(request);
        return Result.success(user);
    }
}
