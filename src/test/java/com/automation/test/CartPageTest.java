package com.automation.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CartPageTest extends BaseTest{

    @Test
    public void verifyUserCanRemoveItemFromCart(){
        System.out.println("Test - Verify user can remove item from cart");
    }

    @Test
    public void verifyUserCanAddItemIntoCart(){
        System.out.println("Test - Verify user can add item into cart");
    }

    @Test
    public void verifyUserCanChangeQuantityOfProductOnCartPage(){
        System.out.println("Test - Verify user can change quantity");
    }

}
