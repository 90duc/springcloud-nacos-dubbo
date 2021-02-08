package com.mk.springcloud.dubbo.interfaces.service;

import com.mk.springcloud.dubbo.interfaces.entity.User;

import java.util.List;

public interface IUserService {

    List<User> list(String classId);

    User get(String userId);
}
