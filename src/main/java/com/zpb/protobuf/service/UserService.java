package com.zpb.protobuf.service;

import com.zpb.protobuf.test.hello.UserResponse;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author       pengbo.zhao
 * @description  
 * @createDate   2021/11/5 11:35
 * @updateDate   2021/11/5 11:35
 * @version      1.0
 */
@Service
public class UserService {

    private List<UserResponse> userResponseList;

    @PostConstruct
    public void initUserList(){
        userResponseList = new ArrayList<>();
        UserResponse userResponse1 = UserResponse.newBuilder()
                .setUsername("张三")
                .setAge(23)
                .setDept("开发")
                .setJob("code")
                .build();

        UserResponse userResponse2 = UserResponse.newBuilder()
                .setUsername("李四")
                .setAge(24)
                .setDept("测试")
                .setJob("unit test")
                .build();

        userResponseList.add(userResponse1);
        userResponseList.add(userResponse2);
    }

    public UserResponse findUserByName(String userName){
        return userResponseList.stream()
                .filter(userResponse -> userResponse.getUsername().equals(userName))
                .collect(Collectors.toList())
                .get(0);
    }

}
