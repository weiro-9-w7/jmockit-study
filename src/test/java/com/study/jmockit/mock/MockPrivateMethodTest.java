package com.study.jmockit.mock;

import mockit.Mock;
import mockit.MockUp;
import org.testng.annotations.Test;

public class MockPrivateMethodTest {

    @Test
    public void testPrivateMethod(){

        //impact all instance of the class
        new MockUp<SimpleDAO>(){
            //Don't impact on no mocked method
            @Mock
            private String fun2(String str) {
                return "(MOCK)";
            }
        };

        SimpleService service = new SimpleService();
        System.out.println(service.fun4("param"));
    }
}
