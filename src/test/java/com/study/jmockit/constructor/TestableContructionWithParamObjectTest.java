package com.study.jmockit.constructor;

import mockit.Mock;
import mockit.MockUp;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class TestableContructionWithParamObjectTest {
    final class MockTestableContructionWithParamObject extends MockUp<TestableContructionWithParamObject> {
        @Mock
        public void $init(String name, Object obj) {
            System.out.println(">>>>>>>>call mocked constructor");
            assertEquals("test", name);
            assertNotNull(obj);
        }
    }

    @BeforeClass
    public void beforeMethod(){
        new MockTestableContructionWithParamObject();
    }

    @Test
    public void testContructor(){
        new TestableContructionWithParamObject("test", new Object()).func1();
    }
}