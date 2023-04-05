package org.example.tests;

import org.example.pages.HomePage;
import org.example.pages.ShoppingCartEmptyPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ShoppingCardTest extends TestRunnerFirst{

    @Test
    public void emptyShoppingCardTest(){

        HomePage homePage = loadApplication();
        presentationSleep();

        ShoppingCartEmptyPage shoppingCartEmptyPage = homePage.gotoShoppingCartEmptyPage();
        String text = shoppingCartEmptyPage.getShoppingCardInfoText();
        Assert.assertEquals(text, ShoppingCartEmptyPage.EXPECTED_EMPTY);
        presentationSleep();

        homePage = shoppingCartEmptyPage.gotoHomePageUsingContinue();
        Assert.assertEquals(homePage.getSlideshow0FirstImageAttributeAltText(), HomePage.EXPECTED_IPHONE_6);
        presentationSleep();
    }

}
