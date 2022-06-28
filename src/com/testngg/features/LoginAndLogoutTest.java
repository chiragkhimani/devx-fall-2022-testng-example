package com.testngg.features;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginAndLogoutTest extends BaseTest {

    @Test(groups = {"Regression", "Fernando"},dataProvider = "positiveData")
    public void verifyPositiveAmountScenario(int amount) {
        System.out.println(amount);
    }


    @Test(groups = {"Regression", "Fernando"},dataProvider = "positiveData")
    public void verifyNegativeAmountScenario(int amount) {
        System.out.println(amount);
    }

    @DataProvider(name="positiveData")
    public Object[] positiveAmountData(){
        Object[] obj= {1,99999999,556,0.11};
        return obj;
    }

    @DataProvider(name="negativeData")
    public Object[] negativeAmountData(){
        Object[] obj= {0.001,999999990,-12,909090999};
        return obj;
    }

}
