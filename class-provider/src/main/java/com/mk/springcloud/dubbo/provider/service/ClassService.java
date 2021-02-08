package com.mk.springcloud.dubbo.provider.service;

import com.mk.springcloud.dubbo.interfaces.entity.ClassInfo;
import com.mk.springcloud.dubbo.interfaces.service.IClassService;
import org.springframework.stereotype.Service;

@org.apache.dubbo.config.annotation.Service
@Service
public class ClassService implements IClassService {


    @Override
    public ClassInfo get(String classId) {
        ClassInfo classInfo = new ClassInfo();
        classInfo.setClassId(classId);
        classInfo.setClassName(this.getClass().getSimpleName());
        return classInfo;
    }
}
