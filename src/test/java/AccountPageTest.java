import Pages.AccountPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.time.Duration;

public class AccountPageTest {
    public static WebDriver driver;
    public AccountPage accountpage=new AccountPage(driver);
    @BeforeMethod
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\saina\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("https://qamoviesapp.ccbp.tech");
        accountpage=new AccountPage(driver);
    }
    @Test(priority=17)
    public void AccountPageTest(){
        accountpage.enterUsername("rahul");
        accountpage.enterPassword("rahul@2021");
        accountpage.clickLoginButton();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
        driver.findElement(By.xpath("//button[@class='avatar-button']")).click();
        System.out.println(driver.findElement(By.xpath("//p[@class='membership-username']")).getText());
        System.out.println(driver.findElement(By.xpath("//p[@class='membership-password']")).getText());
        Assert.assertTrue(driver.findElement(By.xpath("//p[@class='membership-username']")).getText().equalsIgnoreCase("User name : rahul"));
        driver.findElement(By.xpath("//button[normalize-space()='Logout']")).click();
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }




}
