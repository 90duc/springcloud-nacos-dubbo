package com.mk.springcloud.dubbo.interfaces.service;

import com.mk.springcloud.dubbo.interfaces.entity.ClassInfo;

public interface IClassService {

    ClassInfo get(String classId);
}
