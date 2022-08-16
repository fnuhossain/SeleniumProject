package pageObjectModelDemo.pageClasess;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import testNGDemo.AppInitTestNG;

public class AuthenticationPage extends AppInitTestNG{
    WebDriver driver;


   // public void clicksingin(){
       // WebElement singin=driver.findElement(By.xpath("//a[contains (text(),'Sign')]"));
        //singin.click();

    // Constructor is a special method
    public AuthenticationPage(WebDriver driver){
        this.driver=driver;
    }

  // }

    //page element
    @FindBy (xpath = "//a[contains(text(),'Sign')]")
    WebElement signin;
    @FindBy(xpath = "//input[@id='email_create']")
    WebElement newemail;
    @FindBy(xpath = "//button[@id='SubmitCreate']")
    WebElement CreateAccountbutton;
    @FindBy(xpath = "//input[@id='email']")
    WebElement loginemail;
    @FindBy(xpath = "//input[@id='passwd']")
    WebElement loginpassword;





    //method according to action
    public void clickonsingin(){
        signin.click();
    }
    public void insertemail(){
        newemail.sendKeys("Hossain123@gmail.com");
    }
    public void clickOnCreateAccount(){
        CreateAccountbutton.click();
    }
    public void insertloginemail(){
        loginemail.sendKeys("Hossain123@gmail.com");
    }
    public void insertloginpassword(){
        loginpassword.sendKeys("Hossain123");
    }
}


