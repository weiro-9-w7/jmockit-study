package com.study.jmockit.staticmethod;

public class StaticClass {

    public static String func1(){
        System.out.println(">> this is a static method.");
        return "func1";
    }

    public String func2(){
        System.out.println("begin to call static method - func1");
        String method = func1();
        return method;
    }
}
