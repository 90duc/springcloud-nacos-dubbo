package com.mk.springcloud.dubbo.provider.service;

import com.mk.springcloud.dubbo.interfaces.entity.User;
import com.mk.springcloud.dubbo.interfaces.service.IUserClassService;
import com.mk.springcloud.dubbo.interfaces.service.IUserService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;

import java.util.List;

@org.apache.dubbo.config.annotation.Service
@Service
public class UserClassService implements IUserClassService {

    @Reference(check = false)
    private IUserService userService;

    @Override
    public List<User> listAll(String classId){

        return userService.list(classId);
    }
}
