package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class frame extends AppInit{

    public void frameDemo() throws InterruptedException {
        driver.switchTo().frame(0);
        Thread.sleep(3000);
        WebElement javautil = driver.findElement(By.xpath("//a[@href='java/util/package-frame.html'and@target='packageFrame']"));
        javautil.click();
        Thread.sleep(3000);

        driver.switchTo().defaultContent();

        driver.switchTo().frame(1);
        Thread.sleep(3000);
        WebElement arrayList = driver.findElement(By.xpath("//a[@title='class in java.util'and@href='ArrayList.html']"));
        arrayList.click();
        Thread.sleep(3000);

        driver.switchTo().defaultContent();

        driver.switchTo().frame(2);
        WebElement classArrayList = driver.findElement(By.xpath("//h2[text()='Class ArrayList<E>']"));
        String text = classArrayList.getText();
        System.out.println(text);
        Thread.sleep(3000);

        if (text.equalsIgnoreCase("Class ArrayList<E>")) {
            System.out.println("The text is ok");
        }
        else {
            System.out.println("The text is not ok");
        }
       // driver.quit();
    }


        public static void main(String[] args) throws InterruptedException {

            frame obj = new frame();
            obj.lunchbrowser("chrome", "https://docs.oracle.com/javase/7/docs/api/");
            obj.frameDemo();
        }
    }

