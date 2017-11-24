package com.study.jmockit.constructor;

public class TestableContructionWithParamObject {

    public TestableContructionWithParamObject(String param1, Object param2) {

        System.out.println(param1 + ", " + param2);
        System.out.println("begin to construct TestableObject");
        // some complex logic
    }

    public TestableContructionWithParamObject() {
        System.out.println("this is real constructor method.");
    }

    public void func1() {
        System.out.println("call func1");
    }
}
