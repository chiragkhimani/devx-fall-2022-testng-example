package com.automation.test;


import org.testng.annotations.*;

public class LoginTest extends BaseTest{

    @Parameters("browser")
    @Test(groups = "Smoke")
    public void verifyLoginSuccessful(String browser) {
        System.out.println("Open Website");
        System.out.println("Do login");
        System.out.println("Verify Login successful");
        System.out.println(browser);
    }

    @Test(groups = "Regression")
    public void secondTest() {
        System.out.println("Second Test");
    }

    @Test(groups = "Chirag")
    public void thirdTest() {
        System.out.println("Third Test");
    }

}
