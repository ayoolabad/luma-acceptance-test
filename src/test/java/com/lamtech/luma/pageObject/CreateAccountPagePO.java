package com.lamtech.luma.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateAccountPagePO {


    //Element locators
    @FindBy(id = "firstname")
    public static WebElement firstnameField;

    @FindBy(id = "lastname")
    public static WebElement lastnameField;

    @FindBy(id = "email_address")
    public static WebElement emailField;

    @FindBy(id = "password")
    public static WebElement passwordField;

    @FindBy(id = "password-confirmation")
    public static WebElement confirmpasswordField;

    @FindBy(css = "#form-validate > div > div.primary > button > span")
    public static WebElement createAccountButton;

    //Initialise element
    public CreateAccountPagePO(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    //Page specific methods
    public void enterFirstname(String FirstName){
        firstnameField.sendKeys(FirstName);
    }

    public void enterLastname(String LastName){
        lastnameField.sendKeys(LastName);
    }

    public void enterEmail(String Email){
        emailField.sendKeys(Email);
    }

    public void enterPassword(String Password){
        passwordField.sendKeys(Password);
    }

    public void enterConfirmPassword(String ConfirmPassword){
        confirmpasswordField.sendKeys(ConfirmPassword);
    }

    public void clickcreateAccountButton(){
        createAccountButton.click();
    }




}
