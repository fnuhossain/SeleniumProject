package seleniumPractice2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import seleniumPractice.AppInit;

import java.util.Set;

public class WindowHandling extends AppInit {

    public void windowHanles() throws InterruptedException {
        //we will switch between windows. Every window has a Id .so we will switching by id
        String firstwindowid=driver.getWindowHandle();//we will get id of the current window
        System.out.println("first window id" + firstwindowid);
        Thread.sleep(2000);

        WebElement newwindowclick=driver.findElement(By.xpath("//button[text()='New Window']"));
        newwindowclick.click();
        Thread.sleep(2000);

        Set<String> multiplewindowid = driver.getWindowHandles();
        int windowsize=multiplewindowid.size();
        System.out.println("window size " + windowsize);
        System.out.println("window id is are " + multiplewindowid);
        Thread.sleep(2000);
        //driver.switchTo().window(" CDwindow-BFE2816871331CD955DE612E788DB4C1");
        //Thread.sleep(2000);


        for (String m:multiplewindowid){//first loop first windowid,second loop second windowid
            if (!m.equals(firstwindowid)){//first windowid condition false,second window id is
                driver.switchTo().window(m);//switch to second windowid

            }
        }

        Thread.sleep(2000);
        //working in second window
        WebElement samplepage=driver.findElement(By.xpath("//h1[text()='This is a sample page']"));
        String text1=samplepage.getText();
        System.out.println(text1);

        driver.close();//will close the current windows
       // driver.quit();//close all the windows tested by selenium
        Thread.sleep(2000);

        //going back first window
        driver.switchTo().window(firstwindowid);

        WebElement browserwindow=driver.findElement(By.xpath("//div[text() ='Browser Windows']"));
        String text2=browserwindow.getText();
        System.out.println(text2);


    }


    public static void main(String[] args) throws InterruptedException {

        WindowHandling obj=new WindowHandling();
        obj.lunchbrowser("chrome","https://demoqa.com/browser-windows");
        obj.windowHanles();

    }
}
