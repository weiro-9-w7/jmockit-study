package com.study.jmockit.mock;


import mockit.Expectations;
import mockit.Mocked;
import mockit.Verifications;
import org.testng.annotations.Test;

public class SimpleServiceTest {

    @Mocked
    SimpleDAO simpleDAO;

    @Test
    public void testExpectation() {

        // no mocked method will return null;
        new Expectations() {
            {
                simpleDAO.fun1(anyString);
                result = "MOCK";
            }
        };

        System.out.println(simpleDAO.fun1("param"));
        System.out.println(simpleDAO.fun3("param"));
        System.out.println(new SimpleService().fun1("param"));

        new Verifications() {
            {
                simpleDAO.fun1(anyString);
                times = 2;
            }
        };
    }
}