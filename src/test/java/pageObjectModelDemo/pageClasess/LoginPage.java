package pageObjectModelDemo.pageClasess;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import testNGDemo.AppInitTestNG;

public class LoginPage extends AppInitTestNG {
    WebDriver driver;
    // Constructor is a special method
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }


    @FindBy(xpath = "//button[@id='SubmitLogin']")
    WebElement Singinbutton;

    public void clickonSignin(){
        Singinbutton.click();
    }
}
