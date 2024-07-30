package org.aleksdrinkov.pageobjects;

import org.aleksdrinkov.abstractcomponents.AbstractComponent;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BookStorePage extends AbstractComponent {

    WebDriver driver;
    public BookStorePage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public Boolean verifyBookStoreUrl() {
        String pageUrl = driver.getCurrentUrl();
        return pageUrl.contains("/books");
    }
}
