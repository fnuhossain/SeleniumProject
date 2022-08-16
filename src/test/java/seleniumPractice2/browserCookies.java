package seleniumPractice2;

import org.openqa.selenium.Cookie;
import seleniumPractice.AppInit;

public class browserCookies extends AppInit {

    public void browserCookiesDemo() throws InterruptedException {

        System.out.println(driver.manage().getCookies().size());

        Thread.sleep(2000);

        System.out.println(driver.manage().getCookies());

        driver.manage().deleteAllCookies();


        Thread.sleep(1000);

        System.out.println(driver.manage().getCookies().size());

        System.out.println(driver.manage().getCookies());

        driver.quit();



    }

    public void addCookie() throws InterruptedException {

        Cookie add=new Cookie("mycookie123","123456789");
        driver.manage().addCookie(add);
        Thread.sleep(2000);

        System.out.println(driver.manage().getCookies().size());
        Thread.sleep(2000);

        System.out.println(driver.manage().getCookies());
        Thread.sleep(2000);

        driver.manage().deleteAllCookies();
        //driver.manage().deleteCookie(add);
        Thread.sleep(2000);

        System.out.println(driver.manage().getCookies().size());
        Thread.sleep(1000);

        System.out.println(driver.manage().getCookies());



        driver.manage().getCookieNamed("add");
        driver.quit();



    }

    public static void main(String[] args) throws InterruptedException {
        browserCookies obj=new browserCookies();
        //obj.lunchbrowser("chrome","https://www.amazon.com");
       // obj.browserCookiesDemo();
        obj.lunchbrowser("chrome","https://www.homedepot.com");

        obj.addCookie();

    }
}
