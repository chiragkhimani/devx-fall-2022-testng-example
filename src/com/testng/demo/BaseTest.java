package com.testng.demo;

import org.testng.annotations.*;

public class BaseTest {

    @BeforeTest
    @Parameters("browser")
    public void setUp(String browser){
        System.out.println("Launching ---> "+browser);
    }

    @AfterTest
    public void cleanUp(){
        System.out.println("After");
    }

}
