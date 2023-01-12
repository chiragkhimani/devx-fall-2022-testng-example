package com.automation.test;

import org.testng.annotations.Test;

public class ProductListingPageTest extends BaseTest {

    @Test(groups = {"Ali","Smoke"}, priority = 1)
    public void verifyEachProductPrice() {
        System.out.println("Test - Verify Each Product Price");
    }

    @Test(groups = "Chirag", priority = 2)
    public void verifyEachProductHasStockInformation() {
        System.out.println("Test - Verify Each Product Stock Information");
    }

    @Test(priority = 3)
    public void verifyEachProductHasAddToCartButton() {
        System.out.println("Test - Verify Each Product Add To Cart Button");
    }

}
