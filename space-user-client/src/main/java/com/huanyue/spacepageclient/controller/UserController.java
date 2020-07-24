package com.huanyue.spacepageclient.controller;

import com.huanyue.spacepageclient.entity.Result;
import com.huanyue.spacepageclient.entity.User;
import com.huanyue.spacepageclient.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("${apiPath}/user")
@Api(tags = {"用户"})
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/login")
    @ResponseBody
    @ApiOperation(value = "用户登录")
    public Result login(@RequestBody User user){
        return userService.login(user);
    }


}
