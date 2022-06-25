package com.testngg.features;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract class BaseTest {

    @BeforeMethod
    public void setUp(){
        System.out.println("Open Browser");
        System.out.println("Navigate to https://www.saucedemo.com/");
        System.out.println("Verify user is on login page");
    }

    @AfterMethod
    public void cleanUp(){
        System.out.println("Closing browser");
    }
}
