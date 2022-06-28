package com.testngg.features;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PDPPageTest extends BaseTest {

    @Test(groups = "Smoke")
    public void verifyProductDetailsPage() {
        System.out.println("PDP Test"+Thread.currentThread().getId());
    }

    @Test
    public void verifyAddToCartBtnFunctionality() {
        System.out.println("PDP Test"+Thread.currentThread().getId());
    }

    @Test
    public void verifyProductDetailsNavigation() {
        System.out.println("PDP Test"+Thread.currentThread().getId());
    }

}
