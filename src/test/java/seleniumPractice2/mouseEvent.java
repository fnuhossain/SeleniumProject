package seleniumPractice2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import seleniumPractice.AppInit;

public class mouseEvent extends AppInit {
    //mouse right click means context click/double click

    public void mouseEventDemo() throws InterruptedException {
        WebElement searchinput=driver.findElement(By.xpath("//*[@id=\"search_query_top\"]"));

        WebElement searchbutton=driver.findElement(By.xpath("//*[@id=\"searchbox\"]/button"));
        Thread.sleep(3000);

        new Actions(driver).contextClick(searchinput).build().perform();

        new Actions(driver).click(searchinput).sendKeys("dresses").build().perform();
        Thread.sleep(3000);
        new Actions(driver).doubleClick(searchbutton).build().perform();
    }






    public static void main(String[] args) throws InterruptedException {
        mouseEvent obj=new mouseEvent();
        obj.lunchbrowser("chrome","http://automationpractice.com/index.php");
        obj.mouseEventDemo();
    }
}
