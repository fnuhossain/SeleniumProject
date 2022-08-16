package testNGDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class Test_TestNG extends AppInitTestNG {
    @BeforeMethod
    public void bc() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //before throwing exceptions on any element in the script whereever it is extended
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

    }

    @Test
    public void createACC() {
        WebElement signin = driver.findElement(By.xpath("//a[contains(text(),'Sign')]"));
        signin.click();
    }

    @AfterMethod
    public void screenshot() throws IOException {

        try {
            TakesScreenshot ss = (TakesScreenshot) driver; // ss is a reference variable of Interface
            File memoryLocation = ss.getScreenshotAs(OutputType.FILE);//keep screenshot in memory Location
            // FileHandler.copy(memoryLocation, new File("C:\\Users\\mdhos\\IdeaProjects\\SeleniumPractice\\src\\ScreenshotFloder/ss1.png"));
            FileHandler.copy(memoryLocation, new File(screenshotPath + "ss2.png"));

        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
