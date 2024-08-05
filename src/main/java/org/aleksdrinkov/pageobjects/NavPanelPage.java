package org.aleksdrinkov.pageobjects;

import org.aleksdrinkov.abstractcomponents.AbstractComponent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class NavPanelPage extends AbstractComponent {

    WebDriver driver;
    public NavPanelPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public WebElement selectMainMenu(String mainMenuTitle) {
        return driver.findElement(By.xpath("//div[contains(text(),'" + mainMenuTitle + "')]"));
    }

    public WebElement selectSubMenu(String mainMenuTitle, String subMenuTitle) {
        return selectMainMenu(mainMenuTitle).findElement(By.xpath("//span[contains(text(),'" + subMenuTitle + "')]"));
    }
}
