package com.testngg.features;

import org.testng.annotations.Test;

public class CartPageTest extends BaseTest {

    @Test
    public void verifyRemoveItemFunctionality() {
        System.out.println("Open Browser ");
        System.out.println("Navigate to https://www.saucedemo.com/");
        System.out.println("Verify user is on login page");
        System.out.println("Login with valid credentials (standard_user, secret_sauce)");
        System.out.println("Verify user is on inventory page");
        System.out.println("Click on Sauce Labs Backpack item");
        System.out.println("Verify user is on product detail page");
        System.out.println("Click on add to cart button");
        System.out.println("Verify Add to Cart button text changed to Remove");
        System.out.println("Click on cart icon from right side of page");
        System.out.println("Verify user is on cart page");
        System.out.println("Click on remove button on cart page");
        System.out.println("Verify no items should be avaiable on cart");
    }

}
