import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import javax.xml.namespace.QName;
import java.util.concurrent.TimeUnit;
public class elenta {
    public static WebDriver driver;


    @Test
        public void eLentaRegistration(){
            driver.get("https://elenta.lt/registracija");
            driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[1]/div[2]/div[2]/button[1]")).click();
            driver.findElement(By.id("UserName")).sendKeys("EGaga23r" + Math.random() * 100);
            driver.findElement(By.id("Email")).sendKeys("EFGama23axer" + Math.random() * 100 + "@emaxer.ru");
            driver.findElement(By.id("Password")).sendKeys("Emaxerewq");
            driver.findElement(By.id("Password2")).sendKeys("Emaxerewq");
            driver.findElement(By.xpath("//*[@id=\"main-container\"]/form/fieldset/table/tbody/tr[11]/td[2]/input")).click();
            driver.close();
        }




    @Test
    public void addMessage() throws InterruptedException {
        driver.get("https://elenta.lt/patalpinti/ivesti-informacija?categoryId=AutoMoto_Automobiliai&actionId=Siulo&returnurl=%2Fskelbimai%2Fauto-moto%2Fautomobiliai");
        driver.findElement(By.xpath("/html/body/div[5]/div[2]/div[1]/div[2]/div[2]/button[1]/p")).click();
        driver.findElement(By.id("title")).sendKeys("Мои поздравления Китай Гордиться тобой " + (int)(Math.random() * 100) + " Раз");
        driver.findElement(By.id("text")).sendKeys("Горжусь вот столько раз: " + (int)(Math.random() * 100) + " Привет разработчикам лучшего сайта в литве где можно заказать проституток");
        driver.findElement(By.id("price")).sendKeys(""+(int)(Math.random() * 1000));
        driver.findElement(By.id("location-search-box")).sendKeys("Kaunas");
        int min= 1000000;
        int max = 9999999;
        int rndNum = min + (int) Math.round(Math.random() * (max - min));
        driver.findElement(By.id("phone")).sendKeys("+3706" +rndNum);
        driver.findElement(By.id("email")).sendKeys(  (int)(Math.random() * 100000000) + "@relaxer.ru");
        driver.findElement(By.id("submit-button")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("forward-button")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("forward-button")).click();
        driver.close();
    }


  //  @Test
   // public void writeToUs(){
    //    driver.get("https://elenta.lt/kontaktai");
    //    driver.findElement(By.xpath("/html/body/div[5]/div[2]/div[1]/div[2]/div[2]/button[1]/p")).click();
       // driver.findElement(By.xpath("//*[@id=\"contact_subject\"]")).sendKeys("Привет разработчикам лучьшего сайтв в литве где можно заказать проституток" + Math.random() * 100);
     //   driver.findElement(By.xpath("//*[@id=\"contact_us\"]/fieldset/div[2]")).sendKeys("У вас самые всратые проститутки в Литве! Так держать родина гордиться вами" + Math.random() * 100);
      //  driver.findElement(By.xpath("//*[@id=\"contact_us\"]/fieldset/div[3]/label")).sendKeys("whore" + Math.random() * 100  +"@gmail.com");
     //   driver.findElement(By.name("accepted_gdpr")).click();
      //  driver.findElement(By.xpath("//*[@id=\"contact_us\"]/fieldset/div[8]/button")).click();



    //}
    @BeforeClass
    public void beforeLenta(){
        driver = new ChromeDriver();;
        driver.manage().window().maximize();

       // driver.manage().timeouts().implicitlyWait(20L, TimeUnit.SECONDS);

    }
}