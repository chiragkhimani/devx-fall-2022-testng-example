package com.testngg.features;

import org.testng.annotations.Test;

public class PDPPageTest extends BaseTest {

    @Test
    public void verifyProductDetailsPage() {
        System.out.println("Login with valid credentials (standard_user, secret_sauce)");
        System.out.println("Verify user is on inventory page");
        System.out.println("Click on Sauce Labs Backpack item");
        System.out.println("Verify user is on product detail page");
        System.out.println("Verify item details (title, description, price) should be same as inventory page");
    }

}
