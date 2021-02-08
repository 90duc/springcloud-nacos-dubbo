package com.mk.springcloud.dubbo.provider.service;

import com.mk.springcloud.dubbo.interfaces.entity.User;
import com.mk.springcloud.dubbo.interfaces.service.IUserService;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@org.apache.dubbo.config.annotation.Service
@Service
public class UserService implements IUserService {

    @Override
    public List<User> list(String classId) {
        User user = new User();
        user.setUserId("1");
        user.setClassId(classId);
        return Arrays.asList(user);
    }

    @Override
    public User get(String userId) {
        User user = new User();
        user.setUserId(userId);
        user.setClassId("1");
        return user;
    }
}
