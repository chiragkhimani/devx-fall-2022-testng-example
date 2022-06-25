package com.testngg.features;

import org.testng.Assert;
import org.testng.annotations.Test;

@Test(dependsOnGroups = "login")
public class PDPPageTest extends BaseTest {

    @Test(groups = "Smoke")
    public void verifyProductDetailsPage() {
        System.out.println("PDP Test 1");
    }

    @Test(dependsOnGroups = "login")
    public void verifyAddToCartBtnFunctionality() {
        System.out.println("PDP Test 1");
    }

    @Test
    public void verifyProductDetailsNavigation() {
        Assert.fail();
    }

}
