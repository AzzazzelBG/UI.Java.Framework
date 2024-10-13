package org.aleksdrinkov.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookStoreLoginPage extends BasePage {

    WebDriver driver;

    public BookStoreLoginPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        navPanel = new NavPanelPage(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//h1[contains(text(),'Login')]")
    WebElement loginHeader;
    @FindBy(id = "newUser")
    public WebElement newUserButton;

    public void goTo() {
        driver.get("https://demoqa.com/login");
    }

    public Boolean verifyLoginTitleIsDisplayed() {
        return  loginHeader.isDisplayed();
    }
}
