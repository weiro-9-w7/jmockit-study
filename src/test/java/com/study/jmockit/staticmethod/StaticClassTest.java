package com.study.jmockit.staticmethod;

import mockit.Mock;
import mockit.MockUp;
import org.testng.annotations.Test;

public class StaticClassTest {

    class MockStaticClass extends MockUp<StaticClass> {

        @Mock
        public String func1(){
            System.out.println(">> this is a mocked static method.");
            return "func1";
        }

    }

    @Test
    public void testFunc2() throws Exception {
        new MockStaticClass();
        StaticClass obj =  new StaticClass();
        obj.func2();
    }

}