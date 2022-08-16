package testNGDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ParallelExecution {
    WebDriver driver;

    @Test
    public void titleTest(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mdhos\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");
        Assert.assertEquals(driver.getTitle(),"My Store");// here we are validating

    }

    @Test
    public void logoTest(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\mdhos\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("http://automationpractice.com/index.php?");
        WebElement logo= driver.findElement(By.xpath("//img[@class='logo img-responsive']"));
        Assert.assertTrue(logo.isDisplayed());//here we are validating

    }
    @Test
    public void DepartmentsTest(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\mdhos\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("http://automationpractice.com/index.php?");
        WebElement department=driver.findElement(By.xpath("//a[@link-identifier='Departments']"));
        Assert.assertTrue(department.isDisplayed());

    }
}
