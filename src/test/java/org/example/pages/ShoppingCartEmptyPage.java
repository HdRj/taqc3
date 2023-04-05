package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ShoppingCartEmptyPage extends TopPart{
    public static final String EXPECTED_EMPTY = "Your shopping cart is empty!";
    private WebElement shoppingCardLabel;
    private WebElement shoppingCardInfoLabel;
    private WebElement continueButton;

    public ShoppingCartEmptyPage(WebDriver driver) {
        super(driver);
        initElements();
    }

    private void initElements() {
        shoppingCardLabel = driver.findElement(By.xpath("//*[@id='content']/h1"));
        shoppingCardInfoLabel = driver.findElement(By.xpath("//*[@id='content']/p"));
        continueButton = driver.findElement(By.xpath("//*[@id='content']/div/div[@class='float-end']/a"));
    }

    public String getShoppingCardInfoText() {
        return shoppingCardInfoLabel.getText();
    }

    public WebElement getShoppingCardInfoLabel() {
        return shoppingCardInfoLabel;
    }

    public WebElement getShoppingCardLabel() {
        return shoppingCardLabel;
    }

    public void clickContinueButton(){
        continueButton.click();
    }

    public HomePage gotoHomePageUsingContinue(){
        clickContinueButton();
        HomePage homePage = new HomePage(driver);
        return homePage;
    }
}
