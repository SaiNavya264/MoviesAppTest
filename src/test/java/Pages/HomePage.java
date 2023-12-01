package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    public final WebDriver driver;
    By LoginButton=By.className("login-button");
    By USERNAME=By.id("usernameInput");
    By PASSWORD=By.id("passwordInput");
    By trendingNow=By.xpath("//h1[normalize-space()='Trending Now']");
    By space=By.xpath("//button[normalize-space()='Play']");
    By movies=By.xpath("//img[@alt='Avatar']");
    By footer=By.xpath("//div[@class='footer-container']");
    By contact=By.xpath("//p[@class='contact-us-paragraph']");
    public HomePage(WebDriver driver) {
        this.driver=driver;
    }
    public void clickLoginButton(){ driver.findElement(LoginButton).click(); }
    public void enterUsername(String username){
        driver.findElement(USERNAME).sendKeys(username);
    }
    public void enterPassword(String password){
        driver.findElement(PASSWORD).sendKeys(password);
    }






}
