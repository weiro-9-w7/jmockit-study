package com.study.jmockit.staticblock;

public class StaticBlockObject {
    static{
        System.out.println("this is static block, you need to mocked them");
    }

    public void func1(){
        System.out.println("this is func1 method.");
    }
}
