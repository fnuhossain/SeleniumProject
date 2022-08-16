package seleniumPractice2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import seleniumPractice.AppInit;

public class keyboardHandling extends AppInit {

    public void keyboardHandlingDemo() throws InterruptedException {

        WebElement searchinput=driver.findElement(By.xpath("//input[@name='search_query'and@id='search_query_top']"));

        new Actions(driver).click(searchinput).keyDown(Keys.SHIFT).sendKeys("dresses").keyUp(Keys.SHIFT).build().perform();
        WebElement searchbutton=driver.findElement(By.xpath("//button[@type='submit'and@name='submit_search']"));

        Thread.sleep(2000);
        searchbutton.sendKeys(Keys.chord(Keys.ENTER));
        Thread.sleep(3000);

        new Actions(driver).sendKeys(Keys.PAGE_DOWN).build().perform();
        Thread.sleep(3000);

        new Actions(driver).sendKeys(Keys.PAGE_UP).build().perform();


    }

    public static void main(String[] args) throws InterruptedException {
        keyboardHandling obj=new keyboardHandling();
        obj.lunchbrowser("chrome","http://automationpractice.com/index.php");
        obj.keyboardHandlingDemo();


    }
}
