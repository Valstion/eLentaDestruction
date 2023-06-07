import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
public class sablonas {
    @Test
    public void openWebside(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://skelbiu.lt");
    }
    @Test
    public void beforeClickMadeAd(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://skelbiu.lt");
    }

    @BeforeClass
    public void beforeClass1(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://skelbiu.lt");
    }

    @AfterClass
    public void afterClass2(){
        WebDriver driver = new ChromeDriver();
        driver.quit();
    }


}