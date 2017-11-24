package mod.code.tec.case2;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class UseParamsSourceTest {

    class FakeParamsSource extends ParamsSource{
        @Override
        public String func1(){
            return "mock func1";
        }
    }

    @Test
    public void testFunc1() throws Exception {
        UseParamsSource source = new UseParamsSource();
        ParamsSource paramSource = new FakeParamsSource();
        String value = source.func1(paramSource);
        Assert.assertEquals(value, "mock func1");
    }

}