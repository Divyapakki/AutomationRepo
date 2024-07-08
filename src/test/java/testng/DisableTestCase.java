package testng;

import org.testng.annotations.Test;

public class DisableTestCase {

    @Test(priority = 'c')
    public void newTestCase_A()
    {
        System.out.println("New Test case A");
    }

    @Test(priority = -20)
    public void newTestCase_B()
    {
        System.out.println("New Test case B");
    }

    @Test(priority = 3)
    public void newTestCase_C()
    {
        System.out.println("New Test case C");
    }

    @Test(priority = 4, enabled = false)
    public void newTestCase_D()
    {
        System.out.println("New Test case D");
    }
}


