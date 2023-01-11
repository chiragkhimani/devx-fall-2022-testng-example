package com.automation.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract class BaseTest {

    @BeforeMethod
    public void setUp() {
        System.out.println("Open Browser");
    }

    @AfterMethod
    public void cleanUp() {
        System.out.println("Close Browser");
    }

}
