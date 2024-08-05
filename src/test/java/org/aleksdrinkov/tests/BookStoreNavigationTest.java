package org.aleksdrinkov.tests;

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
}
