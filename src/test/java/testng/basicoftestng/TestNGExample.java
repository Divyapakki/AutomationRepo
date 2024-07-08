package testng.basicoftestng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNGExample {


    @Test
    public void testCase1() {

        System.setProperty("webdriver.Chrome.driver", "C:\\Users\\Akash Patnaik\\Downloads\\edgedriver_win64\\msedgedriver.exe");
        WebDriver driver = new ChromeDriver();   //upcasting
        driver.get("https://www.apache.org/");
        driver.manage().window().maximize();
        driver.close();
    }
        @Test
        public void testCase2(){

            System.setProperty("webdriver.Chrome.driver", "C:\\Users\\Akash Patnaik\\Downloads\\edgedriver_win64\\msedgedriver.exe");
            WebDriver driver = new ChromeDriver();   //upcasting
            driver.get("https://testng.org/");
            driver.manage().window().maximize();
            driver.close();




        }
}