package com.automation.test;


import org.testng.annotations.*;

public class LoginTest extends BaseTest{

    @Test(groups = "Smoke")
    public void verifyLoginSuccessful() {
        System.out.println("Open Website");
        System.out.println("Do login");
        System.out.println("Verify Login successful");
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
