package org.aleksdrinkov.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookStorePage extends BasePage {

    WebDriver driver;
    public BookStorePage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        navPanel = new NavPanelPage(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "login")
    WebElement loginButton;

    public BookStoreLoginPage clickOnLoginButton() {
        loginButton.click();
        return new BookStoreLoginPage(driver);
    }

    public WebElement bookWithTitle(String bookTitle) {
        return driver.findElement(By.xpath("//a[text()='" + bookTitle + "']"));
    }

    public Boolean verifyBookStoreUrl(String url) {
        String pageUrl = driver.getCurrentUrl();
        return pageUrl.contains("/" + url.toLowerCase());
    }
}
