package pageObjectModelDemo.pageClasess;

import org.openqa.selenium.WebDriver;
import testNGDemo.AppInitTestNG;

public class createAnAccountPage extends AppInitTestNG {
    WebDriver driver;


    // Constructor is a special method
    public createAnAccountPage(WebDriver driver) {
        this.driver = driver;
    }
}
