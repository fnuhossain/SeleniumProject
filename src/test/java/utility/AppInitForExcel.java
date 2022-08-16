package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

public class AppInitForExcel {
    WebDriver driver;

    @BeforeClass

    public void launchBrowser() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\mdhos\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver=new ChromeDriver();
        Thread.sleep(3000);

        driver.navigate().to("http://automationpractice.com/index.php?controller=authentication&back=my-account");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.navigate().refresh();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Thread.sleep(3000);
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

    }
}
