package testng.mavendemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MavenExample {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.Chrome.driver", "C:\\Users\\Akash Patnaik\\Downloads\\edgedriver_win64\\msedgedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.letskodeit.com/practice");
        driver.manage().window().maximize();

        Thread.sleep(4000);

        driver.close();





    }
}
