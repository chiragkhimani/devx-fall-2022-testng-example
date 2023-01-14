package com.automation.test;

import org.testng.annotations.Test;

public class CartPageTest extends BaseTest {

    @Test(groups = "smoke")
    public void verifyUserCanAddItemIntoCart() {
        System.out.println("Test - Verify user can add item into cart");
        throw new RuntimeException("Test Failed");
    }

    @Test(dependsOnGroups = "smoke")
    public void verifyUserCanRemoveItemFromCart() {
        System.out.println("Test - Verify user can remove item from cart");
    }

    @Test(dependsOnGroups = "smoke")
    public void verifyUserCanChangeQuantityOfProductOnCartPage() {
        System.out.println("Test - Verify user can change quantity");
    }

}
