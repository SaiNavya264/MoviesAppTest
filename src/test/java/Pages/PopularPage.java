package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PopularPage {
    WebDriver driver;
    By LoginButton=By.className("login-button");
    By USERNAME=By.id("usernameInput");
    By PASSWORD=By.id("passwordInput");

    public PopularPage(WebDriver driver) {
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
