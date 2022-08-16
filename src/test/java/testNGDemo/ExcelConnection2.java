package testNGDemo;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelConnection2 extends AppInitTestNG{
    WebDriver driver;


    @Test
    public void excelDemo2() throws IOException, InterruptedException {

        FileInputStream excel;
        excel = new FileInputStream("C:\\Users\\mdhos\\OneDrive\\Documents\\nachlace.xlsx");
        XSSFWorkbook book = new XSSFWorkbook(excel);//connecting with my workbook
        XSSFSheet sheet = book.getSheet("Sheet1"); //connecting with sheet


        int indexnumberofrow = sheet.getLastRowNum();
        System.out.println(indexnumberofrow); // comes into index,value

        int numberofcolum = sheet.getRow(0).getLastCellNum();
        System.out.println(numberofcolum);

        for (int i = 0; i <= indexnumberofrow; i++) {
            XSSFRow row = sheet.getRow(i);
            for (int j = 0; j < numberofcolum; j++) {

                String text = sheet.getRow(i).getCell(j).getStringCellValue();
                System.out.println(text);
                Thread.sleep(3000);


                WebElement searchinput = driver.findElement(By.xpath("//input[@id='search_query_top']"));
                Thread.sleep(3000);
                searchinput.clear();
                Thread.sleep(3000);
                searchinput.sendKeys(text);
                Thread.sleep(3000);

                new Actions(driver).sendKeys(Keys.ENTER).build().perform();


            }
        }
    }
}
