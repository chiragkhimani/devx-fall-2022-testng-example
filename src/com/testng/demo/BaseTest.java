package com.testng.demo;

import org.testng.annotations.*;

public class BaseTest {
    @BeforeTest
    public void setUp(){
        System.out.println("Before");
    }

    @AfterTest
    public void cleanUp(){
        System.out.println("After");
    }

}
