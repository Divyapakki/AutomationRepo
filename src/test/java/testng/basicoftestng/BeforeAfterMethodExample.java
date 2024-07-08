package testng.basicoftestng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforeAfterMethodExample {

    @BeforeMethod
    public void beforeMethodDemo() {
        System.out.println("Before Method");

    }

    @Test
    public void nameTest_1(){
        System.out.println("Name test 1");
    }

    @Test

    public void nameTest_2(){
        System.out.println("Name test 2");
    }

    @Test

    public void nameTest_3(){
        System.out.println("Name test 2");
    }

    @AfterMethod

    public void afterMethodDemo(){
        System.out.println("after method");
    }


}
