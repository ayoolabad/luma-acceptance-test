package com.lamtech.luma.stepDefinition;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogInSteps {
    WebDriver driver;
    @Given("^user is on Sign In page$")
    public void userIsOnSignInPage() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("http://demo-magento2.vuestorefront.io/customer/account/login/");
        driver.findElement(By.linkText("Sign In")).click();
    }

    @When("^user enters the \"([^\"]*)\" address$")
    public void userEntersTheAddress(String Email) throws Throwable {
        driver.findElement(By.name("login[username]")).sendKeys(Email);
    }

    @And("^user inputs the \"([^\"]*)\"$")
    public void userInputsThe(String Password) throws Throwable {
        driver.findElement(By.name("login[password]")).sendKeys(Password);
    }

    @And("^user clicks on Sign In page$")
    public void userClicksOnSignInPage() {
        driver.findElement(By.cssSelector("#send2 > span")).click();
        //driver.findElement(By.xpath("//*[@id=\"send2\"]/span")).click();

    }

    @Then("^user MyDashboard page is displayed$")
    public void userMyDashboardPageIsDisplayed() {
        driver.quit();
    }
}
