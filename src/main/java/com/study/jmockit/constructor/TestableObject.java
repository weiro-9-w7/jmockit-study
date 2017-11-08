package com.study.jmockit.constructor;

public class TestableObject {

    public TestableObject(){
        System.out.println("begin to construct TestableObject");
    }

    public void func1(){
        System.out.println("call func1");
    }
}
