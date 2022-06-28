package com.testngg.features;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract class BaseTest {

    @BeforeMethod
    public void setUp(){
        System.out.println("Opening browser");
    }

    @AfterMethod
    public void cleanUp(){
        System.out.println("Closing browser");
    }
}
