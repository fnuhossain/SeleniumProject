package pageObjectModelDemo.testClasess;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pageObjectModelDemo.pageClasess.AuthenticationPage;
import pageObjectModelDemo.pageClasess.LoginPage;
import seleniumPractice.AppInit;
import testNGDemo.AppInitTestNG;

public class LoginTest extends AppInitTestNG {

    AuthenticationPage Authobj;
    LoginPage loginPageObj;


    @Test
    public void connection(){
        Authobj = PageFactory.initElements(driver, AuthenticationPage.class);
        //LoginPage loginPageObj=PageFactory.initElements(driver, LoginPage.class);
        loginPageObj=PageFactory.initElements(driver, LoginPage.class);// we create object of the page
    }

    @Test
    public void verifyLoginpage(){
        Authobj.insertloginemail();
        Authobj.insertloginpassword();
        loginPageObj.clickonSignin();
    }
}

