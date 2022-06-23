package com.testngg.features;

import org.testng.annotations.Test;

public class LoginAndLogoutTest extends BaseTest {

    @Test
    public void verifyLoginLogoutFunctionalitiy() {
        System.out.println("Open Browser ");
        System.out.println("Navigate to https://www.saucedemo.com/");
        System.out.println("Verify user is on login page");
        System.out.println("Login with valid credentials (standard_user, secret_sauce)");
        System.out.println("Verify user is on inventory page");
        System.out.println("Click on hamburger menu from left");
        System.out.println("Verify items four items on hamburger menu");
        System.out.println("Click on logout button");
        System.out.println("Verify user is on login page");
    }

}
