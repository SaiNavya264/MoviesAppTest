import Pages.LoginPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class LoginPageTest {
    public static WebDriver driver;
    public LoginPage loginpage=new LoginPage(driver);
    @BeforeMethod
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\saina\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("https://qamoviesapp.ccbp.tech");
        loginpage=new LoginPage(driver);
    }
    @Test(priority=1)
    public void testLoginPageUI(){
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement LogoImage=wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("img")));
        System.out.println(driver.findElement(By.className("sign-in-heading")).getText());
        System.out.println(driver.findElement(By.xpath("//label[normalize-space()='USERNAME']")).getText());
        System.out.println(driver.findElement(By.xpath("//label[normalize-space()='PASSWORD']")).getText());
        System.out.println(driver.findElement(By.className("login-button")).getText());
    }
    @Test(priority=2)
    public void testLoginWithEmptyFields() {
        loginpage.clickLoginButton();
    }
    @Test(priority=3)
    public void testLoginWithEmptyUsername() {
        loginpage.clickLoginButton();
    }
    @Test(priority=4)
    public void testLoginWithEmptyPassword() {
        loginpage.clickLoginButton();
    }
    @Test(priority=5)
    public void testLoginWithInvalid() {
        loginpage.enterUsername("rahul");
        loginpage.enterPassword("navya");
        loginpage.clickLoginButton();
    }
    @Test(priority=6)
    public void testLoginWithValid() {
        loginpage.enterUsername("rahul");
        loginpage.enterPassword("rahul@2021");
        loginpage.clickLoginButton();
    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }




}
