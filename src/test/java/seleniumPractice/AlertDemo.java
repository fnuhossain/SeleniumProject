package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AlertDemo extends AppInit{
    public void alertPractice() throws InterruptedException {
        WebElement input=driver.findElement(By.xpath("//input[@name='cusid' and @type='text']"));
        input.sendKeys("56342");
        Thread.sleep(2000);

        WebElement submit=driver.findElement(By.xpath("//input[@name='submit' and @type='submit']"));
        submit.click();

        String alertText=driver.switchTo().alert().getText();
        System.out.println(alertText);
        Thread.sleep(2000);
        driver.switchTo().alert().accept();
        Thread.sleep(2000);
        String alerttext2=driver.switchTo().alert().getText();
        System.out.println(alerttext2);
        Thread.sleep(2000);
        driver.switchTo().alert().accept();
        driver.switchTo().defaultContent();

    }

    public static void main(String[] args) throws InterruptedException {
        AlertDemo obj=new AlertDemo();
        obj.lunchbrowser("chrome","https://demo.guru99.com/test/delete_customer.php");
        obj.alertPractice();

    }

}
