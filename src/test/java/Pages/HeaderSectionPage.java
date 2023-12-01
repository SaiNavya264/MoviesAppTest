package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HeaderSectionPage {
    WebDriver driver;
    By LoginButton=By.className("login-button");
    By USERNAME=By.id("usernameInput");
    By PASSWORD=By.id("passwordInput");
    By HomeNavbar=By.xpath("//a[normalize-space()='Home']");
    By PopularNavbar=By.xpath("//a[normalize-space()='Popular']");
    By AccountNavbar=By.xpath("//img[@alt='profile']");

    public HeaderSectionPage(WebDriver driver) {
        this.driver=driver;
    }
    public void clickLoginButton(){ driver.findElement(LoginButton).click(); }
    public void enterUsername(String username){
        driver.findElement(USERNAME).sendKeys(username);
    }
    public void enterPassword(String password){
        driver.findElement(PASSWORD).sendKeys(password);
    }

    public boolean isNavbarElementDisplayed(String home) {
        return driver.findElement(HomeNavbar).isDisplayed();

    }
    public boolean isNavbarElementDisplayed2(String Popular){
        return driver.findElement(PopularNavbar).isDisplayed();

    }
    public boolean isNavbarElementDisplayed3(String Account){
        return driver.findElement(AccountNavbar).isDisplayed();

    }

}
