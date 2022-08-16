package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class DropDownDemo extends AppInit{

    public void dropDownPractice() throws InterruptedException {
        Select dropdown=new Select(driver.findElement(By.xpath("//select[starts-with(@id,'oldSelectMenu')]")));
        dropdown.selectByVisibleText("Green");
        Thread.sleep(4000);

        dropdown.selectByIndex(5);

        Thread.sleep(4000);
        dropdown.deselectByValue("10");
    }

    public static void main(String[] args) throws InterruptedException {
        DropDownDemo obj=new DropDownDemo();
        obj.lunchbrowser("chrome","http://demoqa.com/select-menu");
    }

}
