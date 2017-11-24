package mod.code.tec;

import org.testng.Assert;
import org.testng.annotations.Test;

public class UseHttpParamTest {

    @Test
    public void testPrintHttpParams(){
        UseHttpParam user = new UseHttpParam();
        String value = user.printHttpParams(new FakeHttpServletRequest());
        Assert.assertEquals(value, "aa");
    }
}