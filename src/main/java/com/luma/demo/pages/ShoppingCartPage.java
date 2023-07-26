package com.luma.demo.pages;

import com.luma.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCartPage extends Utility
{
    private static final Logger log = LogManager.getLogger(ShoppingCartPage.class.getName());

    public ShoppingCartPage(){
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(xpath = "//td[@class='col item']//a[normalize-space()='Overnight Duffle']")
    WebElement productNameTextElement;

    //Verify the Qty is ‘3’
    By attributeValue = By.xpath("//input[@title='Qty']");
    @CacheLookup
    @FindBy(xpath = "(//span[@class='cart-price']//span)[2]")
    WebElement productPrice;
    @CacheLookup
    @FindBy(xpath = "(//input[@class='input-text qty'])[1]")
    WebElement updateShoppingCartField;
    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Update Shopping Cart']")
    WebElement updateShoppingCartButton;

    @FindBy(xpath = "(//span[@class='cart-price']//span)[2]")
    WebElement updatedProductPrice;

    @CacheLookup
    @FindBy(xpath = "//span[@class='base']")
    WebElement shoppingCartTextElement;
    @CacheLookup
    @FindBy(xpath = "//td[@class='col item']//a[normalize-space()='Cronus Yoga Pant']")
    WebElement cronusYogaPantsTextElement;
    @CacheLookup
    @FindBy(xpath = "//dd[contains(text(),'32')]")
    WebElement size32TextElement;

    @CacheLookup
    @FindBy(xpath = "//dd[contains(text(),'Black')]")
    WebElement colourBlackTextElement;

    public String getTextProductNameTextElement() throws InterruptedException {
        log.info("Get product name text : " + productNameTextElement.toString());
        Thread.sleep(1000);
        return getTextFromElement(productNameTextElement);
    }

    public String getInputQty() throws InterruptedException {
        log.info("Get input quantity : " + attributeValue.toString());
        Thread.sleep(1000);
        return getTextFromElement((By) attributeValue);
    }

    public String getProductPrice() throws InterruptedException {
        log.info("Get product price : " + productPrice.toString());
        Thread.sleep(1000);
        return getTextFromElement(productPrice);
    }

    public void sendQtyToUpdateInQuantityBox(String quantity) throws InterruptedException {
        log.info("Update quantity box : " + updateShoppingCartField.toString());
        Thread.sleep(2000);
        sendTextToElement(updateShoppingCartField, quantity);
    }

    public void clickUpdateShoppingCartButton() throws InterruptedException {
        log.info("Click on shopping cart button : " + updateShoppingCartButton.toString());
        Thread.sleep(1000);
        clickOnElement(updateShoppingCartButton);
    }

    public String getUpdatedProductPrice() throws InterruptedException {
        log.info("Get updated product price : " + updatedProductPrice.toString());
        Thread.sleep(1000);
        return getTextFromElement(updatedProductPrice);
    }

    public String getShoppingCartText(){
        log.info("Get shopping cart text : " + shoppingCartTextElement.toString());
        return getTextFromElement(shoppingCartTextElement);
    }

    public String getCronusYogaPantText(){
        log.info("Get Cronus yoga pant : " + cronusYogaPantsTextElement.toString());
        return getTextFromElement(cronusYogaPantsTextElement);
    }

    public String getSize32Text(){
        log.info("Get text of the size : " + size32TextElement.toString());
        return getTextFromElement(size32TextElement);
    }

    public String getColourBlackText(){
        log.info("Get colour black text : " + colourBlackTextElement.toString());
        return getTextFromElement(colourBlackTextElement);
    }
}
