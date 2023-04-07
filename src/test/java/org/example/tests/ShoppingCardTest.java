package org.example.tests;

import org.example.pages.HomePage;
import org.example.pages.ShoppingCartEmptyPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ShoppingCardTest extends TestRunnerFirst{

    @Test
    public void emptyShoppingCardTest(){
        SoftAssert asert = new SoftAssert();

        HomePage homePage = loadApplication();
        presentationSleep();

        ShoppingCartEmptyPage shoppingCartEmptyPage = homePage.gotoShoppingCartEmptyPage();
        String text = shoppingCartEmptyPage.getShoppingCardInfoText();
        asert.assertEquals(text, ShoppingCartEmptyPage.EXPECTED_EMPTY);
        presentationSleep();

        homePage = shoppingCartEmptyPage.gotoHomePageUsingContinue();
        asert.assertEquals(homePage.getSlideshow0FirstImageAttributeAltText(), HomePage.EXPECTED_IPHONE_6);
        presentationSleep();
        asert.assertAll();
    }

}
