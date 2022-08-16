package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Validation extends AppInit{
    public void Validation1() throws InterruptedException {
        WebElement login=driver.findElement(By.xpath("//a[contains(text(),'Sign in')]"));
        login.click();
        Thread.sleep(3000);

        WebElement email=driver.findElement(By.xpath("//input[@id='email'and@type='text']"));
        email.sendKeys("hossain56@gmail.com");
        Thread.sleep(3000);

        WebElement password=driver.findElement(By.xpath("//input[@id='passwd'and@name='passwd']"));
        password.sendKeys("5545H");
        Thread.sleep(3000);

        WebElement signin=driver.findElement(By.xpath("//button[@type='submit'and@name='SubmitLogin']"));
        signin.click();
        Thread.sleep(3000);

        WebElement name=driver.findElement(By.xpath("//span[text()='md Hossain']"));
        boolean display=name.isDisplayed();
        System.out.println(display);
        Thread.sleep(3000);

        String text= name.getText();// Validating name/home page
        System.out.println(text);
        Thread.sleep(3000);

        if (text.equalsIgnoreCase("md Hossain")){
            System.out.println("we have landed on home page");
        }
        else {
            System.out.println("we are not in the home page");

        }

    }
    public void Validation2() throws InterruptedException {
        WebElement searchinput=driver.findElement(By.cssSelector("input#search_query_top"));//cssSelector
        searchinput.sendKeys("Summer Dresses");
        Thread.sleep(3000);

        WebElement searchbutton=driver.findElement(By.cssSelector("button.button-search")); // css class
        searchbutton.click();
        Thread.sleep(3000);

        WebElement comparebutton=driver.findElement(By.xpath("//div[@class='top-pagination-content clearfix']/form/button"));

        boolean comparebuttonEnabled = comparebutton.isEnabled();/// use Enabled
        System.out.println("compare button enabled " + comparebuttonEnabled);
       // driver.quit();

    }


    public static void main(String[] args) throws InterruptedException {
        Validation obj=new Validation();
        obj.lunchbrowser("Chrome","http://automationpractice.com/index.php?");
        Thread.sleep(3000);
        obj.Validation1();
        Thread.sleep(3000);
       // obj.Validation2();

    }
}
