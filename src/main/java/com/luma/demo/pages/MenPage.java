package com.luma.demo.pages;

import com.luma.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MenPage extends Utility
{
    private static final Logger log = LogManager.getLogger(MenPage.class.getName());

    public MenPage(){
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Cronus Yoga Pant']")
    WebElement cronusYogaPants;
    @CacheLookup
    @FindBy(xpath = "(//div[@class='swatch-option text'])[1]")
    WebElement cronusYogaPants32;
    @CacheLookup
    @FindBy(xpath = "(//div[@class='swatch-option color'])[1]")
    WebElement cronusYogaPantsBlack;
    @CacheLookup
    @FindBy(xpath = "(//span[contains(text(),'Add to Cart')])[1]")
    WebElement addToCart;
    @CacheLookup
    @FindBy(xpath = "//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']")
    WebElement addedToShoppingCartTextMessage;
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='shopping cart']")
    WebElement shoppingCart;

    public void mouseHoverOnCronusYogaPantsAndClickOn32() throws InterruptedException {
        log.info("Mouse hover on Over Cronus yoga pants and click on 32 : " + cronusYogaPants32.toString());
        Thread.sleep(1000);
        mouseHoverToElement(cronusYogaPants);
        mouseHoverToElementAndClick(cronusYogaPants32);
    }

    public void mouseHoverOnCronusYogaPantsAndClickOnBlack() throws InterruptedException {
        log.info("Mouse hover on Over Cronus yoga pants and click on Black : " + cronusYogaPantsBlack.toString());
        Thread.sleep(1000);
        mouseHoverToElement(cronusYogaPants);
        mouseHoverToElementAndClick(cronusYogaPantsBlack);
    }

    public void mouseHoverOnCronusYogaPantsAndClickOnAddToCart() throws InterruptedException {
        log.info("Mouse hover on Over Cronus yoga pants and click on addToCart : " + addToCart.toString());
        Thread.sleep(1000);
        mouseHoverToElement(cronusYogaPants);
        mouseHoverToElementAndClick(addToCart);
    }

    public String getAddedToCartMessage(){
        log.info("Get added to cart message : " + addedToShoppingCartTextMessage.toString());
        return getTextFromElement(addedToShoppingCartTextMessage);
    }

    public void clickOnShoppingCartElement(){
        log.info("Click on shopping cart : " + shoppingCart.toString());
        clickOnElement(shoppingCart);
    }
}
