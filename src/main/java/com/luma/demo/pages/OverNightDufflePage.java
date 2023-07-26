package com.luma.demo.pages;

import com.luma.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OverNightDufflePage extends Utility
{
    private static final Logger log = LogManager.getLogger(OverNightDufflePage.class.getName());

    public OverNightDufflePage(){
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//span[@class='base']")
    WebElement overnightDuffleTextElement;
    @CacheLookup
    @FindBy(xpath = "//input[@id='qty']")
    WebElement inputQuantityBox;

    @CacheLookup
    @FindBy(xpath = "//button[@id='product-addtocart-button']")
    WebElement addToCartButton;

    @CacheLookup
    @FindBy(xpath = "//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']")
    WebElement addedToShoppingCartTextMessage;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='shopping cart']")
    WebElement shoppingCart;

    public String getOvernightDuffleText() throws InterruptedException {
        log.info("Get over night duffel text : " + overnightDuffleTextElement.toString());
        Thread.sleep(1000);
        return getTextFromElement(overnightDuffleTextElement);
    }

    public void sendQtyToInputQuantityBox(String quantity) throws InterruptedException {
        log.info("Send quantity to quantity box : " + inputQuantityBox.toString());
        Thread.sleep(2000);
        sendTextToElement(inputQuantityBox, quantity);
    }

    public void clickOnOverAddToCartButton() throws InterruptedException {
        log.info("Click on add to cart : " + addToCartButton.toString());
        Thread.sleep(1000);
        clickOnElement(addToCartButton);
    }

    public String getAddedToCartMessage() throws InterruptedException {
        log.info("Get added to cart message : " + addedToShoppingCartTextMessage.toString());
        Thread.sleep(1000);
        return getTextFromElement(addedToShoppingCartTextMessage);
    }

    public void clickOnShoppingCartElement() throws InterruptedException {
        log.info("Click on shopping cart : " + shoppingCart.toString());
        Thread.sleep(1000);
        clickOnElement(shoppingCart);
    }
}
