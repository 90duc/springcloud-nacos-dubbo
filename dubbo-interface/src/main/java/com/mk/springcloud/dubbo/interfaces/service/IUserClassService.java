package com.mk.springcloud.dubbo.interfaces.service;

import com.mk.springcloud.dubbo.interfaces.entity.User;

import java.util.List;

public interface IUserClassService {
    List<User> listAll(String classId);
}
