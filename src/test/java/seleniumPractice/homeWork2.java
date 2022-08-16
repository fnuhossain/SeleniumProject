package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class homeWork2 {



    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\mdhos\\Downloads\\chromedriver_win32\\chromedriver.exe\\");

        WebDriver driver= new ChromeDriver();
        driver.get("http://demo.automationtesting.in/Register.html");
        driver.manage().window().maximize();

       WebElement firsname= driver.findElement(By.xpath("//input[@placeholder='First Name']"));
       firsname.sendKeys("Md");
       Thread.sleep(3000);

        WebElement lastname=driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
        lastname.sendKeys("Hossain");
        Thread.sleep(3000);

        WebElement address=driver.findElement(By.xpath("//div[@class='col-md-8 col-xs-8 col-sm-8']/textarea"));
        address.sendKeys("220 forbell st brooklyn 11208,new york");
        Thread.sleep(3000);

        WebElement email=driver.findElement(By.xpath("//input[@type='email']"));
        email.sendKeys("Hossain66@gmail.com");
        Thread.sleep(3000);

        WebElement phone=driver.findElement(By.xpath("//input[@type='tel']"));
        phone.sendKeys("6468619392");
        Thread.sleep(3000);

        WebElement gender=driver.findElement(By.xpath("//input[@type='radio']"));
        gender.click();
        Thread.sleep(3000);

        WebElement hobbies=driver.findElement(By.xpath("//input[@type='checkbox'and@id='checkbox1']"));
        hobbies.click();
        Thread.sleep(3000);

       // Select language=new Select(driver.findElement(By.xpath("//div[starts-with(@id,'msdd')]")));
        //language.selectByIndex(7);
        //language.click();
       // Select english=new Select(language);
        //english.selectByIndex(7);

     WebElement language = driver.findElement(By.xpath("//div[starts-with(@class, 'ui-autocomplete-multiselect')]"));
     language.click();
     Thread.sleep(1000);
         WebElement english2=driver.findElement(By.xpath("//a[text()='English']"));
         english2.click();
        // Thread.sleep(3000);

         Select skill=new Select(driver.findElement(By.xpath("//select[@id='Skills']")));
         skill.selectByVisibleText("C");
         Thread.sleep(3000);

         WebElement selectcountry=driver.findElement(By.xpath("//select[@type='text'and@id='countries']"));
         selectcountry.click();
         Thread.sleep(1000);

         WebElement Country1=driver.findElement(By.xpath("//span[@class='select2-selection select2-selection--single']"));
         Country1.click();


        // WebElement Country=driver.findElement(By.xpath("//select[@id='countries']"));
         //Country.sendKeys("bangladesh");
         //Thread.sleep(1000);


        Select country=new Select(driver.findElement(By.xpath("//select[@id='countries']")));
        country.selectByVisibleText("Bangladesh");










        //1234567890Select country=new Select(driver.findElement(By.xpath("//input[@class='select2-search__field']")));        // country.selectByVisibleText("Bangladesh");
        // Thread.sleep(3000);

         Select year=new Select(driver.findElement(By.xpath("//select[@id='yearbox']")));
         year.selectByVisibleText("1993");
         Thread.sleep(3000);

         Select month=new Select(driver.findElement(By.xpath("//select[@placeholder='Month']")));
         month.selectByVisibleText("August");
         Thread.sleep(3000);

         Select day=new Select(driver.findElement(By.xpath("//select[@placeholder='Day']")));
         day.selectByVisibleText("2");
        Thread.sleep(3000);

        WebElement password=driver.findElement(By.xpath("//input[@id='firstpassword']"));
        password.sendKeys("5545Hossain");
        Thread.sleep(3000);

        WebElement repassword=driver.findElement(By.xpath("//input[@id='secondpassword']"));
        repassword.sendKeys("5545Hossain");
        Thread.sleep(3000);

        WebElement submit=driver.findElement(By.xpath("//button[@id='submitbtn']"));
        submit.click();
        Thread.sleep(3000);

        WebElement refresh=driver.findElement(By.xpath("//button[@id='Button1']"));
        refresh.click();





    }
}
