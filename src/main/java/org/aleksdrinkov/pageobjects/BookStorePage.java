package org.aleksdrinkov.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BookStorePage extends BasePage {

    WebDriver driver;
    public BookStorePage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        navPanel = new NavPanelPage(driver);
        PageFactory.initElements(driver, this);
    }

    public Boolean verifyBookStoreUrl(String url) {
        String pageUrl = driver.getCurrentUrl();
        return pageUrl.contains("/" + url.toLowerCase());
    }
}
