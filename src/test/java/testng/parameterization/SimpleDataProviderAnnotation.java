package testng.parameterization;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SimpleDataProviderAnnotation {

    @DataProvider(name = "test-data")
    public Object[][] dataProviderFun(){
        return new Object[][]  {
                {"Selenium","Mumbai"},
                {"Java","Pune"},
                {"Python","Chennai"}
        };
    }


    @Test(dataProvider = "test-data")
    public void verifyBastInstitute(String courseName,String cityName) throws InterruptedException {
        System.setProperty("webdriver.Chrome.driver","C:\\U sers\\Akash Patnaik\\Downloads\\edgedriver_win64\\msedgedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();

        WebElement searchTextBox = driver.findElement(By.name("q"));
        searchTextBox.sendKeys( courseName + " " + cityName);
        searchTextBox.sendKeys(Keys.ENTER);
        Thread.sleep(3000);
        driver.close();


    }

}
