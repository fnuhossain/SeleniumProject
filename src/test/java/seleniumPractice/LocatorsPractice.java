package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LocatorsPractice extends AppInit {


    //hard coded--inserting data directly into the script
    //soft coded data--bring data from outside of the script like excel sheet or Database.
    public void contactus(){
        WebElement contactus = driver.findElement(By.partialLinkText("Contact"));
        contactus.click();
        WebElement subjectheading = driver.findElement(By.id("id_contact"));
        subjectheading.click();
        //WebElement email = driver.findElement(By.id("email")).sendKeys("hossain78@gmail.com");
       // email.click();
        //WebElement orderR

    }

    public static void main(String[] args) throws InterruptedException {
        LocatorsPractice obj = new LocatorsPractice();
        obj.lunchbrowser("chrome","https://automationpractice.com");
        obj.contactus();

    }
}
