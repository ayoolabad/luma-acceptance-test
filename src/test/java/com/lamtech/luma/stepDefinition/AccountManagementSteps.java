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

public class AccountManagementSteps {
    WebDriver driver;
    @Given("^user is on create an account page$")
    public void userIsOnCreateAnAccountPage() {

        //To instruct selenium to set up chrome driver.
        WebDriverManager.chromedriver().setup();

        //To define and launch chrome driver.
        driver = new ChromeDriver();
        driver.get("http://demo-magento2.vuestorefront.io/");

        //To maximise browser window.
        driver.manage().window().maximize();

        //To click on create an account link.
        driver.findElement(By.linkText("Create an Account")).click();


    }

    @When("^user enters the \"([^\"]*)\"$")
    public void userEntersThe(String FirstName) throws Throwable {
        driver.findElement(By.id("firstname")).sendKeys(FirstName);

    }

    @And("^user enters their \"([^\"]*)\"$")
    public void userEntersTheir(String LastName) throws Throwable {

        driver.findElement(By.id("lastname")).sendKeys(LastName);

    }

    @And("^user enters the \"([^\"]*)\" Address$")
    public void userEntersTheAddress(String Email) throws Throwable {
        driver.findElement(By.id("email_address")).sendKeys(Email);

    }

    @And("^user enters the \"([^\"]*)\" on create account page$")
    public void userEntersTheOnCreateAccountPage(String Password) throws Throwable {
        driver.findElement(By.id("password")).sendKeys(Password);

    }

    @And("^user enters to confirm the \"([^\"]*)\"$")
    public void userEntersToConfirmThe(String ConfirmPassword) throws Throwable {

        driver.findElement(By.id("password-confirmation")).sendKeys(ConfirmPassword);

    }


    @And("^user clicks on CreateAnAccount$")
    public void userClicksOnCreateAnAccount() {

        driver.findElement(By.cssSelector("#form-validate > div > div.primary > button > span")).click();

    }

    @Then("^user MyAccount page is displayed\\.$")
    public void userMyAccountPageIsDisplayed() {

        //driver.findElement(By.id("accountpage")).sendKeys(AccountPage);

        //driver.close();
        //driver.quit();

    }


}
