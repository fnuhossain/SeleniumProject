package seleniumPractice2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import seleniumPractice.AppInit;

import javax.swing.*;

public class HoverOver extends AppInit {

    public void HoverOverDemo() throws InterruptedException {

        driver.switchTo().frame(0);

        WebElement electonics=driver.findElement(By.xpath("//div[@class='ui-menu-item-wrapper' and @id='ui-id-4']"));
        new Actions(driver).moveToElement(electonics).build().perform();
        Thread.sleep(2000);

        WebElement carhifi=driver.findElement(By.xpath("//div[text()='Car Hifi']"));
        carhifi.click();
    }
    public void HoverOverDemo1() throws InterruptedException {
        driver.switchTo().frame(0);
        Thread.sleep(3000);

        WebElement music=driver.findElement(By.xpath("//div[@aria-haspopup='true'and@id='ui-id-9']"));
        new Actions(driver).moveToElement(music).build().perform();
        Thread.sleep(1000);


        WebElement jazz=driver.findElement(By.xpath("//div[@aria-haspopup='true' and@id='ui-id-13']"));
        new Actions(driver).moveToElement(jazz).build().perform();
        Thread.sleep(1000);


        WebElement modern=driver.findElement(By.xpath("//div[@class='ui-menu-item-wrapper' and@id='ui-id-16']"));
        modern.click();


    }
    public void HoverOverDemoAmazon(){

    }
    public static void main(String[] args) throws InterruptedException {
        HoverOver obj = new HoverOver();
        obj.lunchbrowser("chrome","http://jqueryui.com/menu/");
        Thread.sleep(3000);
        obj.HoverOverDemo();
        //obj.HoverOverDemo1();
        //obj.lunchbrowser("chrome","https://www.amazon.com/dp/B08C785J7F/ref=as_sl_pc_as_ss_li_til?tag=drajatthamrin-20&linkCode=w00&linkId=cd51faba92509e5e48682cdc31f38d3e&creativeASIN=B08C785J7F");
        //obj.HoverOverDemoAmazon();
    }
}
