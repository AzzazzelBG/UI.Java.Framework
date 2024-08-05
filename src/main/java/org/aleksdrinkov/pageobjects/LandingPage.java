package org.aleksdrinkov.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage extends BasePage {

    WebDriver driver;

    public LandingPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//h5[text()='Book Store Application']")
    WebElement bookStoreCard;

    public void goTo() {
        driver.get("https://demoqa.com/");
    }

    public BookStorePage navigateToBookStore() {
        bookStoreCard.click();
        return new BookStorePage(driver);
    }
}
