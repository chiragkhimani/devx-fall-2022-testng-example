package com.testngg.features;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

@Test(groups = { "login" })
public class LoginAndLogoutTest extends BaseTest {

    @Test(groups = "Smoke")
    @Parameters({"url","browser"})
    public void verifyLoginLogoutFunctionalitiy(String url, String browser) {
        System.out.println("Open URl "+url);
    }

    @Test(groups = "Smoke")
    @Parameters("browser")
    public void verifyLoginSuccessfulWithValidCredentials(String browser) {
        System.out.println("Login Test 2" + browser);
    }

    @Test(groups ="Fernando")
    @Parameters("browser")
    public void verifyLoginUnSuccessfulWithInValidCredentials(String browser) {
        System.out.println("Login Test 3" + browser);
    }

    @Test(groups = {"Regression", "Fernando"})
    @Parameters("browser")
    public void verifyErrorMessageForBlankCredentials(String browser) {
        System.out.println("Login Test 4" + browser);
    }

}
