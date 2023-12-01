import Pages.MovieDetailsPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class MovieDetailsPageTest {
    public static WebDriver driver;
    public MovieDetailsPage moviepage=new MovieDetailsPage(driver);
    @BeforeMethod
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\saina\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("https://qamoviesapp.ccbp.tech");
        moviepage=new MovieDetailsPage(driver);
    }
    @Test(priority=1)
    public void MovieDetailsPage() {
        moviepage.enterUsername("rahul");
        moviepage.enterPassword("rahul@2021");
        moviepage.clickLoginButton();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
        driver.findElement(By.xpath("//img[@alt='Shang-Chi and the Legend of the Ten Rings']")).click();
        Assert.assertTrue(driver.findElement(By.xpath("//button[normalize-space()='Play']")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.xpath("//p[@class='movie-overview']")).isDisplayed());
        driver.findElement(By.xpath("//a[normalize-space()='Popular']")).click();
        driver.findElement(By.xpath("//img[@alt='The Amazing Spider-Man']")).click();
        Assert.assertTrue(driver.findElement(By.xpath("//h1[normalize-space()='The Amazing Spider-Man']")).getText().equalsIgnoreCase("The Amazing Spider-Man"));
    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
