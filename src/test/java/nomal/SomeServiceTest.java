package nomal;

import mockit.Expectations;
import mockit.Injectable;
import mockit.Tested;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class SomeServiceTest {
    @Tested
    SomeService service;

    @Injectable
    SomeDAO dao;

    @Test
    public void testFun1() throws Exception {
        new Expectations(SomeDAO.class) {
            {
                dao.fun1();
                result = "mocked method!";
            }

        };
        String ret = service.fun1();
        Assert.assertEquals(ret, "mocked method!");
    }

}