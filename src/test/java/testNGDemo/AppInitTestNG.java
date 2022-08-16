package testNGDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class AppInitTestNG {
   public WebDriver driver;
    String CurrentDirectory=new File(System.getProperty("user.dir")).getAbsolutePath();
    String screenshotPath=CurrentDirectory+File.separator+"ScreenshotFolder"+File.separator;


@Parameters({"browser","url"})

    @BeforeClass
            public void launchBrowser(String browser,String url) throws InterruptedException {
        System.out.println("My Absolute Path is "+ CurrentDirectory);
        System.out.println("My ScreenshotPath is "+ screenshotPath);
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mdhos\\Downloads\\chromedriver_win32");
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\mdhos\\Downloads\\geckodriver-v0.30.0-win64\\geckodriver.exe");

         //driver = new ChromeDriver();
         //driver =
        if (browser.equalsIgnoreCase("chrome")) {
            driver = new ChromeDriver();
            //class will open file chromedriver.exe
        } else if (browser.equalsIgnoreCase("firefox")) {
          //  driver = new FirefoxDriver();
        } else {
            System.out.println("no driver path");

        }


        driver.navigate().to(url);

        //Thread.sleep(3000);
        //driver.navigate().to("https://www.macys.com");
        //Thread.sleep(3000);
       // driver.navigate().to("https://automationpractice.com/index.phd");
        //Thread.sleep(3000);
        driver.manage().window().maximize();
        //driver.manage().window().fullscreen();
        //Thread.sleep(3000);
//        Thread.sleep(3000);
        // driver.navigate().back();
        Thread.sleep(3000);
        //driver.close();
       // String currenturl = driver.getCurrentUrl();
       // System.out.println(currenturl);
       // Thread.sleep(3000);

        //String title = driver.getTitle();
       // System.out.println(title);
        //Thread.sleep(3000);

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //before throwing exceptions on any element in the script whereever it is extended
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);


    }
    @AfterClass
    public void teardown(){

        driver.quit();
    }
}
