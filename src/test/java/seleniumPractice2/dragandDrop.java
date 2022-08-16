package seleniumPractice2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import seleniumPractice.AppInit;

public class dragandDrop extends AppInit {

    public void dragandDropDemo() throws InterruptedException {
        driver.switchTo().frame(0);

        WebElement source=driver.findElement(By.xpath("//div[@id='draggable'and@style='position: relative;']"));
        WebElement target=driver.findElement(By.xpath("//div[@id='droppable'and@class='ui-widget-header ui-droppable']"));
        Thread.sleep(3000);

        //new Actions(driver).dragAndDrop(source,target).build().perform();
        Thread.sleep(3000);

        //
        new Actions(driver).dragAndDropBy(source,source.getLocation().getX()+100,source.getLocation().getY()+100).build().perform();
        //Thread.sleep(3000);
       // new Actions(driver).dragAndDropBy(source,source.getLocation().getX()+100,target.getLocation().getY()+100).build().perform();

    }
    public void dragandDropDemo1() throws InterruptedException {

        WebElement source=driver.findElement(By.xpath("//div[@class='dragableBox'and@id='box1']"));
        WebElement target=driver.findElement(By.xpath("//div[@class='dragableBoxRight'and@id='box103']"));

        new Actions(driver).dragAndDrop(source,target).build().perform();

        Thread.sleep(3000);

        WebElement source1=driver.findElement(By.xpath("//div[@class='dragableBox'and@id='box7']"));
        WebElement target1=driver.findElement(By.xpath("//div[@class='dragableBoxRight'and@id='box107']"));

       new Actions(driver).dragAndDrop(source1,target1).build().perform();
    }

    public static void main(String[] args) throws InterruptedException {
        dragandDrop obj=new dragandDrop();
        obj.lunchbrowser("chrome","http://jqueryui.com/droppable");
        obj.dragandDropDemo();
        //obj.lunchbrowser("chrome","http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
        //obj.dragandDropDemo1();
    }
}
