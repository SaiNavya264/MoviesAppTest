package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;

public class SearchPage {
    WebDriver driver;
    By LoginButton=By.className("login-button");
    By USERNAME=By.id("usernameInput");
    By PASSWORD=By.id("passwordInput");

    public SearchPage(WebDriver driver) {
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
