package com.study.jmockit.mock;

import com.study.jmockit.mock.SimpleDAO;
import com.study.jmockit.mock.SimpleService;
import mockit.Delegate;
import mockit.Expectations;
import mockit.Mocked;
import mockit.Verifications;
import org.testng.annotations.Test;

public class DelegateReturnResultTest {

    @Mocked
    SimpleDAO simpleDAO;

    @Test
    public void testExpectation() {

        new Expectations() {
            {
                simpleDAO.fun1(anyString);
                result = new Delegate<String>() {
                    public String aDelegateMethod(String str) {
                        return str.equals("param0") ? "MOCK0" : "MOCK1";
                    }
                };
            }
        };

        System.out.println(simpleDAO.fun1("param0"));
        System.out.println(simpleDAO.fun3("param"));
        System.out.println(new SimpleService().fun1("param1"));

        new Verifications() {
            {
                simpleDAO.fun1(anyString);
                times = 2;
            }
        };
    }
}
