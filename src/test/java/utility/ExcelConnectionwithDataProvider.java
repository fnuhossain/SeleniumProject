package utility;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;

public class ExcelConnectionwithDataProvider extends AppInitForExcel{



    @Test(dataProvider = "loginData")
    public void testLogin(String userName,String passWord) throws InterruptedException {
        System.out.println(userName+ "|"+passWord);
        Thread.sleep(3000);
        WebElement email=driver.findElement(By.xpath("//input[@id='email']"));
        email.clear();
        email.sendKeys(userName);
        WebElement password=driver.findElement(By.xpath("//input[@id='passwd']"));
        password.clear();
        password.sendKeys(passWord);
        Thread.sleep(3000);
        WebElement clickonsignin=driver.findElement(By.xpath("//button[@id='SubmitLogin']"));
        clickonsignin.click();

    }

    @DataProvider(name="loginData")

    public Object[][] excelDemo() throws IOException {
        FileInputStream excel = new FileInputStream("C:\\Users\\mdhos\\OneDrive\\Documents\\Selenium Note\\sets of excel.xlsx");
        XSSFWorkbook book = new XSSFWorkbook(excel);
        XSSFSheet sheet = book.getSheet("sheet1");
        int rowcount = sheet.getPhysicalNumberOfRows();
        System.out.println(rowcount);

        int columncount = sheet.getRow(0).getPhysicalNumberOfCells();
        System.out.println(columncount);

        Object[][] data = new Object[rowcount][columncount];
        for (int i = 0; i < rowcount; i++) {
            XSSFRow row = sheet.getRow(i);
            for (int j = 0; j < columncount; j++) {
                data[i][j]=sheet.getRow(i).getCell(j).getStringCellValue();


            }

        }
        return data;
    }
}
