package pageObjectModelDemo.testClasess;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pageObjectModelDemo.pageClasess.AuthenticationPage;
import testNGDemo.AppInitTestNG;

public class AuthenticationTest extends AppInitTestNG {

    AuthenticationPage Authobj;


    @Test
    // ew can connect page class with the test class by PageFactory.initElements method, there we give parameter as driver Authentication page

    public void connections() {
        //AuthenticationPage Authobj= PageFactory.initElements(driver,AuthenticationPage.class);
        Authobj = PageFactory.initElements(driver, AuthenticationPage.class);
    }


//    @Test(dependsOnMethods = "connections")
//    public void authentication() throws InterruptedException {
//        Authobj.clickonsingin();
//        Thread.sleep(3000);
//        WebElement text = driver.findElement(By.xpath("//h1[text()= 'Authentication']"));
//        String Authenticationtext = text.getText();
//        System.out.println(Authenticationtext);
//
//    }

    @Test(dependsOnMethods = "authentication")
    public void CreateAccountPage() {
        Authobj.insertemail();
        Authobj.clickOnCreateAccount();
        WebElement text1 = driver.findElement(By.xpath("//h3[text()='Your personal information']"));
        String text2 = text1.getText();
        if (text2.equalsIgnoreCase("Your personal information")){
            System.out.println("we are on right page");
        }
        else {
            System.out.println("we did wrong");
        }

    }
}
