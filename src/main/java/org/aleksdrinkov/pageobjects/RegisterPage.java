package org.aleksdrinkov.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage extends BasePage{

    WebDriver driver;

    public RegisterPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        navPanel = new NavPanelPage(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "firstname")
    WebElement firstNameInput;
    @FindBy(id = "lastname")
    WebElement lastNameInput;
    @FindBy(id = "userName")
    WebElement userNameInput;
    @FindBy(id = "password")
    WebElement passwordInput;
    @FindBy(id = "recaptcha-anchor")
    WebElement captchaCheckbox;
    @FindBy(id = "register")
    WebElement registerButton;
}
