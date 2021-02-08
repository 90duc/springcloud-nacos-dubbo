package com.mk.springcloud.dubbo.interfaces.entity;

public class ClassInfo implements java.io.Serializable{

    private String classId;
    private String className;

    public String getClassId() {
        return classId;
    }

    public void setClassId(String classId) {
        this.classId = classId;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }
}
