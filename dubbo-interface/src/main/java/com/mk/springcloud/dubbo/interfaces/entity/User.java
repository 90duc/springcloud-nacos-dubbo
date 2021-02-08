package com.mk.springcloud.dubbo.interfaces.entity;


import java.io.Serializable;

public class User implements Serializable {

    private String userId;
    private String classId;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getClassId() {
        return classId;
    }

    public void setClassId(String classId) {
        this.classId = classId;
    }
}
