package org.aleksdrinkov.tests;

import org.aleksdrinkov.pageobjects.BookStoreLoginPage;
import org.aleksdrinkov.pageobjects.BookStorePage;
import org.aleksdrinkov.testcomponents.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BookStoreNavigationTest extends BaseTest {

    @Test(groups = {"Navigation"})
    public void navigateToBookStorePage() {

        landingPage.navigateToBookStore();
        BookStorePage bookStorePage = new BookStorePage(driver);
        Assert.assertTrue(bookStorePage.verifyBookStoreUrl("books"));

        bookStorePage.getNavPanel()
                .selectSubMenu("Book Store Application","Login")
                .click();

        bookStorePage.verifyBookStoreUrl("login");
    }

    @Test(groups = {"Navigation"})
    public void navigateToBooksStoreLoginPageByTheLoginButton() {

        landingPage.navigateToBookStore();
        BookStorePage bookStorePage = new BookStorePage(driver);
        Assert.assertTrue(bookStorePage.verifyBookStoreUrl("books"));

        BookStoreLoginPage bookStoreLoginPage = bookStorePage.clickOnLoginButton();
        Assert.assertTrue(bookStoreLoginPage.verifyLoginTitleIsDisplayed());
    }

    @Test(groups = {"Navigation"})
    public void navigateToABookFromTheStore() {

        landingPage.navigateToBookStore();
        BookStorePage bookStorePage = new BookStorePage(driver);
        Assert.assertTrue(bookStorePage.verifyBookStoreUrl("books"));

        bookStorePage.bookWithTitle("Speaking JavaScript").click();
    }
}
