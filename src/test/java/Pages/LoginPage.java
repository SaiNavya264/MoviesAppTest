package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;

public class LoginPage {
    WebDriver driver;
    By LogoImage=By.tagName("img");
    By HeadingText=By.className("sign-in-heading");
    By UsernameLabel=By.xpath("//label[normalize-space()='USERNAME']");
    By PasswordLabel=By.xpath("//label[normalize-space()='PASSWORD']");
    By LoginButton=By.className("login-button");
    By USERNAME=By.id("usernameInput");
    By PASSWORD=By.id("passwordInput");


    public LoginPage(WebDriver driver) {
        this.driver=driver;

    }
    public void clickLoginButton(){
        driver.findElement(LoginButton).click();

    }
    public void enterUsername(String username){
        driver.findElement(USERNAME).sendKeys(username);
    }
    public void enterPassword(String password){
        driver.findElement(PASSWORD).sendKeys(password);
    }

}
