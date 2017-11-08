package com.study.jmockit.staticblock;

import mockit.Mock;
import mockit.MockUp;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class StaticBlockObjectTest {

    final class MockStaticBlockObject extends MockUp<StaticBlockObject>{
        @Mock
        void $clinit() {
            System.out.println(">>>Mocked static block.");
        }
    }



    @Test
    public void testFunc1(){
        new MockStaticBlockObject();
        StaticBlockObject staticBlockObject = new StaticBlockObject();
        staticBlockObject.func1();
    }

}