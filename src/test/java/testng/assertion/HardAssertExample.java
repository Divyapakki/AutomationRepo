package testng.assertion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertExample {

    @Test
    public void verifyHardAssertStatement(){


        System.setProperty("webdriver.Chrome.driver","C:\\Users\\Akash Patnaik\\Downloads\\edgedriver_win64\\msedgedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://mail.rediff.com/cgi-bin/login.cgi");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//u[text()= 'Create a new account']")).click();

        String textTile = driver.findElement( By.xpath("//td[text()='Create a Rediffmail account']")).getText();
       Assert.assertEquals(textTile,"Create a Rediffmail account", "text should be create a Rediffmail");
        WebElement userNameTextBox = driver.findElement(By.xpath("//input[starts-with(@name,'name')]"));
        Assert.assertTrue(userNameTextBox.isDisplayed(),"user name text box should be displayed");

       driver.close();
    }
}
