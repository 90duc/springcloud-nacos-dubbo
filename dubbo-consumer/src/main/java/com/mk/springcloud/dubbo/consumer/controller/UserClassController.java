package com.mk.springcloud.dubbo.consumer.controller;

import com.mk.springcloud.dubbo.interfaces.entity.User;
import com.mk.springcloud.dubbo.interfaces.service.IUserClassService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/class")
public class UserClassController {


    @Reference(check = false)
    private IUserClassService userClassService;

    @GetMapping("/listClassmate")
    public List<User> listClassmate(@RequestParam String classId){

        return userClassService.listAll(classId);
    }



}
