package com.study.jmockit.constructor;

import mockit.Mock;
import mockit.MockUp;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class UseTestableObjectTest {

    final class MockTestableObject extends MockUp<TestableObject>{
        @Mock
        public void $init() {

        }
    }

    @BeforeClass
    public void beforeMethod(){
        new MockTestableObject();
    }

    @Test
    public void testContructor(){
        new TestableObject().func1();
    }

}