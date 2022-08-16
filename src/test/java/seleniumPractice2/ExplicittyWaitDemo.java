package seleniumPractice2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import seleniumPractice.AppInit;

public class ExplicittyWaitDemo extends AppInit {
    //Explicit wait is of two types: 1.WebDriverWait   2.Fluent wait

    /*WebDriverWait will wait till the expected conditions meet. it will wait till a certain period.
    There are few expected Conditions to be meet such as
    1.Elementstobeclickable
    2.Elementstobevisiable
    3.AltertisPresent
    4.Frametobeavailavelandswitchtoit.
    webDriverwait will wait till the given period(30,40,50)and

*/
    public void WebDriverWaitDemo() throws InterruptedException {

        WebElement searchinput=driver.findElement(By.xpath("//input[@name='search_query']"));
        searchinput.sendKeys("Dresses");
        Thread.sleep(3000);

        //WebElement submitbutton=driver.findElement(By.xpath("//button[@name='submit_search']"));
        //submitbutton.click();
        //Thread.sleep(3000);

        String submitbuttonxpath="//button[@name='submit_search']";
        WebElement submitbutton=driver.findElement(By.xpath(submitbuttonxpath));
        elemmentToBeClickable(submitbuttonxpath,5);
        Thread.sleep(2000);
        submitbutton.click();
        Thread.sleep(3000);


       // WebElement comparebutton=driver.findElement(By.xpath("//div[@class='top-pagination-content clearfix']/form/button"));
        String comparebutton="//div[@class='top-pagination-content clearfix']/form/button";


        try {
            elemmentToBeClickable(comparebutton,40);
        }
        catch (Exception e){
            System.out.println(e);
            System.out.println("This is an exception that means it is not clickable");
        }
        finally {
            Thread.sleep(2000);
            WebElement image = driver.findElement(By.xpath("//img[@class='replace-2x img-responsive'and@src='http://automationpractice.com/img/p/1/2/12-home_default.jpg']"));
            image.click();
        }


    }
   // public void elemmentToBeClickable(long millsec,String Xpath){
   public void elemmentToBeClickable(String Xpath,int timeoutsec){
       //WebDriverWait wait = new WebDriverWait(driver,millsec);
       WebDriverWait wait = new WebDriverWait(driver,timeoutsec);
       WebElement clickableElement=driver.findElement(By.xpath(Xpath));
        wait.until(ExpectedConditions.elementToBeClickable(clickableElement));


    }


    public static void main(String[] args) throws InterruptedException {
        ExplicittyWaitDemo obj=new ExplicittyWaitDemo();
        obj.lunchbrowser("chrome","http://automationpractice.com/index.php");
        obj.WebDriverWaitDemo();


    }
}
