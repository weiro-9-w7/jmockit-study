package com.study.jmockit.injectable;

import mockit.Expectations;
import mockit.Injectable;
import mockit.Verifications;
import org.testng.annotations.Test;

public class UseInjectableObjectTest {
    @Injectable
    InjectableObject injectableObject;

    @Test
    public void testExpectation() {

        //未mock函数返回null
        new Expectations() {
            {
                injectableObject.fun1(anyString);
                result = "MOCK";
            }
        };

        System.out.println(injectableObject.fun1("param"));
        System.out.println(injectableObject.fun3("param"));
        System.out.println(new UseInjectableObject().fun1("param"));

        new Verifications() {
            {
                injectableObject.fun1(anyString);
                times = 1;
            }
        };
    }
}