package homeWork;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class AppInit {


    public WebDriver driver;
    public void LunchBrowser(String browser,String url) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\mdhos\\IdeaProjects\\HybridFramework_Practice\\src\\test\\Drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.navigate().to(url);
        Thread.sleep(3000);
        driver.manage().window().maximize();
        Thread.sleep(3000);




    }
    public void Walmart() throws InterruptedException {

        WebElement signin=driver.findElement(By.xpath("//a[@link-identifier='Account']"));
        signin.click();
        WebElement create = driver.findElement(By.xpath("//button[@class='w_4 w_7 w_AA db mb3 w-100']"));
        create.click();
    }

    public static void main(String[] args) throws InterruptedException {
        AppInit obj = new AppInit();
        obj.LunchBrowser("Chrome","https://walmart.com/");
        obj.Walmart();
    }
}
