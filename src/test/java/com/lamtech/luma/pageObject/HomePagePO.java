package com.lamtech.luma.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePagePO {

    //Element locators
    @FindBy(linkText = "Create an Account")
    public static WebElement CreateAccountLink;

    @FindBy(linkText = "Sign In")
    public static WebElement SignInLink;

    //Initialise element
    public HomePagePO(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    //Page specific methods
    public void clickCreateAccountLink(){
        CreateAccountLink.click();
    }

    public void clickSignInLink(){
        SignInLink.click();
    }


}
