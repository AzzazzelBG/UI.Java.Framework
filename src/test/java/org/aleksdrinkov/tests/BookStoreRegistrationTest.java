package org.aleksdrinkov.tests;

import org.aleksdrinkov.pageobjects.BookStoreLoginPage;
import org.aleksdrinkov.testcomponents.BaseTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

public class BookStoreRegistrationTest extends BaseTest {

    @Test(dataProvider = "getData", groups = {"Registration"}) // TODO: Find better solution for not repeating code
    public void registerNewValidUser() {
        BookStoreLoginPage loginPage = new BookStoreLoginPage(driver);
        loginPage.goTo();
        loginPage.newUserButton.click();

    }

    @DataProvider
    public Object[][] getData() throws IOException {

        List<HashMap<String, String>> data = getJsonDataToMap(System.getProperty("user.dir") + "\\src\\test\\java\\org\\aleksdrinkov\\data\\LoginData.json");

        return new Object [][] {
                {data.get(0)},
                {data.get(1)},
                {data.get(2)}
        };
    }
}
