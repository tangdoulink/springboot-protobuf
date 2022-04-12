package com.zpb.protobuf.controller;

import com.zpb.protobuf.test.hello.UserRequest;
import com.zpb.protobuf.test.hello.UserResponse;
import com.zpb.protobuf.service.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author       pengbo.zhao
 * @description  测试-controller
 * @createDate   2021/11/4 17:08
 * @updateDate   2021/11/4 17:08
 * @version      1.0
 */
@RestController
public class TestController {

    @Resource
    private UserService userService;

    @PostMapping(value = "getUser", produces = "application/x-protobuf;charset=utf-8")
    public UserResponse getUser(@RequestBody UserRequest request) {
        String username = request.getUsername();
        return userService.findUserByName(username);
    }

}
