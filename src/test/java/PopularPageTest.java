import Pages.PopularPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class PopularPageTest {
    public static WebDriver driver;
    public PopularPage popularpage=new PopularPage(driver);
    @BeforeMethod
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\saina\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("https://qamoviesapp.ccbp.tech");
        popularpage=new PopularPage(driver);
    }
    @Test(priority=1)
    public void PopularPageUI(){
        popularpage.enterUsername("rahul");
        popularpage.enterPassword("rahul@2021");
        popularpage.clickLoginButton();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
        driver.findElement(By.xpath("//a[normalize-space()='Popular']")).click();
        Assert.assertTrue(driver.findElement(By.className("home-search-container")).isDisplayed());
    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

}
