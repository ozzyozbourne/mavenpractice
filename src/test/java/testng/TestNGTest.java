package testng;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

@Test
public class TestNGTest {

    public void Test(){
        Reporter.log(System.getProperty("tier"), true);
        Assert.assertEquals(System.getProperty("tier"), "dev");
    }
}
