import Pages.HeaderSectionPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class HeaderSectionTest {
    public static WebDriver driver;
    public HeaderSectionPage headerpage=new HeaderSectionPage(driver);
    @BeforeMethod
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\saina\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("https://qamoviesapp.ccbp.tech");
        headerpage=new HeaderSectionPage(driver);
    }
    @Test(priority=1)
    public void HomePageTest() {
        headerpage.enterUsername("rahul");
        headerpage.enterPassword("rahul@2021");
        headerpage.clickLoginButton();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
        Assert.assertTrue(headerpage.isNavbarElementDisplayed("Home"));
        Assert.assertTrue(headerpage.isNavbarElementDisplayed2("Popular"));
        Assert.assertTrue(headerpage.isNavbarElementDisplayed3("Account"));

    }
    @Test(priority=2)
    public void HomePageFunctionality() {
        headerpage.enterUsername("rahul");
        headerpage.enterPassword("rahul@2021");
        headerpage.clickLoginButton();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
        Assert.assertTrue(driver.findElement(By.xpath("//nav[@class='nav-header ']")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.xpath("//img[@alt='website logo']")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.xpath("//a[normalize-space()='Popular']")).isDisplayed());


    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }




}
