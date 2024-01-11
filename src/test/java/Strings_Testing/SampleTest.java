package Strings_Testing;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SampleTest {


    @BeforeClass
    public void setup()
    {
        System.out.println(" i am setup Method");
    }

    @Test
    public void iAmTheMainTest()
    {
        System.out.println("Without Me @test other annotation will not work ");
    }
    @AfterClass
    public void teardown()
    {
        System.out.println(" i am last Method");
    }
}

