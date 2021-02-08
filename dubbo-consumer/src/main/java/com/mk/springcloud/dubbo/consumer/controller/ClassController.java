package com.mk.springcloud.dubbo.consumer.controller;

import com.mk.springcloud.dubbo.interfaces.entity.ClassInfo;
import com.mk.springcloud.dubbo.interfaces.service.IClassService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/class")
public class ClassController {

    @Reference(check = false)
    private IClassService classService;


    @GetMapping("/getClass")
    public ClassInfo getClass(@RequestParam String classId){

        return classService.get(classId);
    }

}
