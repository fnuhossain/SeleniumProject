package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class iFrame extends AppInit{

    public void iFrameDemo() throws InterruptedException {
        // by default we are in main
        WebElement widget=driver.findElement(By.xpath("//h3[text()='Widgets']"));
        String widgettext =  widget.getText();
        System.out.println(widgettext);
        Thread.sleep(3000);

        //switch framee
        driver.switchTo().frame(0);
        WebElement cssButton=driver.findElement(By.xpath("//h1[text()='CSS Buttons']"));
        String cssButtontext = cssButton.getText();
        System.out.println(cssButtontext);
        Thread.sleep(3000);

        driver.switchTo().defaultContent();
        //switching main page
        Thread.sleep(3000);

        WebElement tooltip = driver.findElement(By.xpath("//a[text()='Tooltip']"));
        tooltip.click();
        Thread.sleep(3000);
        //driver.quit();


    }

    public static void main(String[] args) throws InterruptedException {
        iFrame obj=new iFrame();
        obj.lunchbrowser("chrome","https://www.jqueryui.com/button/");
        obj.iFrameDemo();
    }
}
