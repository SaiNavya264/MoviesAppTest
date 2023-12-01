import Pages.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class HomePageTest {
    public static WebDriver driver;
    public HomePage homepage=new HomePage(driver);
    @BeforeMethod
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\saina\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("https://qamoviesapp.ccbp.tech");
        homepage=new HomePage(driver);
    }
    @Test(priority=1)
    public void HomePageTest(){
        homepage.enterUsername("rahul");
        homepage.enterPassword("rahul@2021");
        homepage.clickLoginButton();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
        Assert.assertTrue(driver.findElement(By.xpath("//h1[normalize-space()='Trending Now']")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.xpath("//button[normalize-space()='Play']")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.xpath("//img[@alt='Avatar']")).isDisplayed());
        WebElement footer = driver.findElement(By.xpath("//div[@class='footer-container']"));
        Assert.assertTrue(footer.findElement(By.xpath("//p[@class='contact-us-paragraph']")).isDisplayed());
    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }




}
