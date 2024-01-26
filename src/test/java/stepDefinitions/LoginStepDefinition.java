package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class LoginStepDefinition {

    public WebDriver driver;
    @Given("Navigate to Login Page")
    public void navigate_to_login_page() {
        
        System.setProperty("webdriver.chrome.driver","C:\\Users\\saina\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("https://qamoviesapp.ccbp.tech");
    }
    @When("user enters username")
    public void user_enters_username() {
        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();

        driver.findElement(By.xpath("//*[@id=\"usernameInput\"]")).sendKeys("rahul");
    }
    @When("user enters password")
    public void user_enters_password() {
        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
        driver.findElement(By.xpath("//*[@id=\"passwordInput\"]")).sendKeys("rahul@2021");
    }
    @When("user clicks login button")
    public void user_clicks_login_button() {
        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/form/button")).click();
    }
    @When("user clicks Account page")
    public void user_clicks_account_page() {
        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/nav/div[2]/button[2]/img")).click();
    }
    @Then("user clicks logout")
    public void user_clicks_logout() {
        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div[3]/button")).click();
    }
}
