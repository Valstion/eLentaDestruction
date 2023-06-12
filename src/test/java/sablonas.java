import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;
public class sablonas {
    public static WebDriver driver;
    @Test
    public void beforeClickMadeAd(){
        driver.get("https://skelbiu.lt");
        driver.findElement(By.id("onetrust-button-group")).click();
        driver.findElement(By.id("searchKeyword")).sendKeys("kompiuteris");
        driver.findElement(By.id("searchButton")).click();
        String computers = driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[2]/div[2]/div[1]/ul/li/span")).getText();
        System.out.println(computers);
        Assert.assertEquals(computers, "(42 768)");
    }
    @BeforeClass
    public void beforeClass1(){
        driver = new ChromeDriver();;
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20L, TimeUnit.SECONDS);

    }
    @AfterClass
    public void afterClass2(){
     driver.quit();
    }
}