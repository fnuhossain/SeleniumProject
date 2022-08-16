package seleniumPractice2;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import seleniumPractice.AppInit;

public class JS_Executer extends AppInit {

    public void Scrolling() throws InterruptedException {

        JavascriptExecutor js=(JavascriptExecutor)driver;
        String url=js.executeScript("return document.URL").toString();
        System.out.println(url);
        Thread.sleep(2000);

        String title=js.executeScript("return document.title").toString();
        System.out.println(title);
        Thread.sleep(2000);

        //scroll page till b0ttom
        //js.executeScript("window.scrollBy(0, document.body.scrollHeight)");
        //Thread.sleep(2000);

        //scrolling by using pixel

        js.executeScript("window.scrollBy(0,400)");
        Thread.sleep(2000);

        js.executeScript("window.scrollBy(0,900)");
        Thread.sleep(2000);

        js.executeScript("window.scrollBy(0,900)");

        //scrolling page till we find element

        WebElement storeinformation=driver.findElement(By.xpath("//section[@id='block_contact_infos']/div/h4"));
        js.executeScript("arguments[0].scrollIntoView();",storeinformation);
        Thread.sleep(2000);

        WebElement contactus=driver.findElement(By.xpath("//a[@title='Contact Us']"));
        js.executeScript("arguments[0].scrollIntoView();",contactus);
    }

    public static void main(String[] args) throws InterruptedException {
        JS_Executer obj=new JS_Executer();
        obj.lunchbrowser("chrome","http://automationpractice.com/index.php");
        obj.Scrolling();


    }

}
