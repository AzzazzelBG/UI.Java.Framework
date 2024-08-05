package org.aleksdrinkov.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    protected WebDriver driver;
    protected NavPanelPage navPanel;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        this.navPanel = new NavPanelPage(driver);
        PageFactory.initElements(driver, this);
    }

    public NavPanelPage getNavPanel() {
        return navPanel;
    }
}
