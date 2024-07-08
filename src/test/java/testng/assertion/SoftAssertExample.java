package testng.assertion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertExample {

    @Test
    public void verifySoftAssertStatement(){

        SoftAssert softAssert = new SoftAssert();
        System.setProperty("webdriver.Chrome.driver","C:\\Users\\Akash Patnaik\\Downloads\\edgedriver_win64\\msedgedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://mail.rediff.com/cgi-bin/login.cgi");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//u[text()='Create a new account']")).click();

        String textTile = driver.findElement( By.xpath("//td[text()='Create a Rediffmail account']")).getText();
        softAssert.assertEquals(textTile,"Create a Rediffmail account", "text should be Create a Rediffmail account");
        WebElement userNameTextBox = driver.findElement(By.xpath("//input[starts-with(@name,'name')]"));
        softAssert.assertTrue(userNameTextBox.isDisplayed(),"user name text box should be displayed");
        softAssert.assertAll();
        driver.close();

    }
}


