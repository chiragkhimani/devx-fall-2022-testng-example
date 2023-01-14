package com.automation.test;


import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginDataDrivenTest extends BaseTest {

    @Test(groups = "Smoke", dataProvider = "provideSetOfCredentials")
    public void verifyLoginSuccessful(String username, String password) {
        System.out.println("Logging in with username " + username);
        System.out.println("Logging in with password " + password);
    }

    @DataProvider
    public Object[][] provideSetOfCredentials() {
        Object[][] setOfCred = {
                {"jasur", "jasur123"},
                {"chirag", "chirag123"}
        };
        return setOfCred;
    }


}
