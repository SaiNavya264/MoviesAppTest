import Pages.SearchPage;
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

public class SearchPageTest {
    public static WebDriver driver;
    public SearchPage searchpage=new SearchPage(driver);
    @BeforeMethod
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\saina\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("https://qamoviesapp.ccbp.tech");
        searchpage=new SearchPage(driver);
    }
    @Test(priority=1)
    public void SearchPageFunctionality() {
        searchpage.enterUsername("rahul");
        searchpage.enterPassword("rahul@2021");
        searchpage.clickLoginButton();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
        driver.findElement(By.xpath("//button[@class='search-empty-button']")).click();
        driver.findElement(By.xpath("(//input[@id='search'])[1]")).sendKeys("");
        driver.findElement(By.xpath("//button[@class='search-button']")).click();
        List<WebElement> movieContainer = driver.findElements(By.xpath("//div[@class='home-search-container']"));
        System.out.println("No of Movies Displayed:" + movieContainer.size());
    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }


}
