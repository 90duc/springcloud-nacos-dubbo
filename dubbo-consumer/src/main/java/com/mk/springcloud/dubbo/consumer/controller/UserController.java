package com.mk.springcloud.dubbo.consumer.controller;

import com.mk.springcloud.dubbo.interfaces.entity.User;
import com.mk.springcloud.dubbo.interfaces.service.IUserService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Reference(check = false)
    private IUserService userService;


    @GetMapping("/get")
    public User listClassmate(@RequestParam String userId){

        return userService.get(userId);
    }



}
