package testng.parameterization;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;

public class DataProviderWithExcelSheet {


    @DataProvider(name = "test-data")
    public Object[][] dataProviderFun() throws IOException {
        Object[][] arrObj = getExcelData("C:\\Users\\Akash Patnaik\\Downloads\\test.xlsx","data1");
        return arrObj;
    }

    public String[][] getExcelData(String filePath,String sheetName) throws IOException {

        FileInputStream fileInputStream = new FileInputStream(filePath);
        XSSFWorkbook xssfWorkbook = new XSSFWorkbook(fileInputStream);
        XSSFSheet sheet = xssfWorkbook.getSheet(sheetName);
        XSSFRow row = sheet.getRow(0);
        int noOfRows = sheet.getPhysicalNumberOfRows();
        int noOfCols = row.getLastCellNum();

        Cell cell;
        String[][] data = new String[noOfRows - 1][noOfCols];

        for (int i = 1; i < noOfRows-1; i++) {
            for (int j = 0; j < noOfCols; j++) {
                row = sheet.getRow(i);
                cell = row.getCell(j);
                data[i-1][j] = cell.getStringCellValue();
            }
        }
        return  data;
    }

    @Test(dataProvider = "test-data")
    public void verifyBastInstitute(String courseName, String cityName) throws InterruptedException {
        System.setProperty("webdriver.Chrome.driver", "C:\\Users\\Akash Patnaik\\Downloads\\edgedriver_win64\\msedgedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();

        WebElement searchTextBox = driver.findElement(By.name("q"));
        searchTextBox.sendKeys(courseName + " " + cityName);
        searchTextBox.sendKeys(Keys.ENTER);
        Thread.sleep(3000);
        driver.close();
    }
}