package com.luma.demo.pages;

import com.luma.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Utility
{
    private static final Logger log = LogManager.getLogger(GearPage.class.getName());

    public HomePage(){
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Women']")
    WebElement womenMenu;
    @CacheLookup
    @FindBy(xpath = "//a[@id='ui-id-9']//span[contains(text(),'Tops')]")
    WebElement womenTops;
    @CacheLookup
    @FindBy(xpath = "//a[@id='ui-id-11']//span[contains(text(),'Jackets')]")
    WebElement womenJackets;
    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Men']")
    WebElement menMenu;
    @CacheLookup
    @FindBy(xpath = "//a[@id='ui-id-18']")
    WebElement menBottoms;
    @CacheLookup
    @FindBy(xpath = "//a[@id='ui-id-23']//span[contains(text(),'Pants')]")
    WebElement menPants;

    @FindBy(xpath = "//span[normalize-space()='Gear']")
    WebElement gearMenu;
    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Bags']")
    WebElement gearBags;


    public void mouseHoverOnWomenMenu() throws InterruptedException {
        log.info("Mouse hover on Over women menu : " + womenMenu.toString());
        Thread.sleep(1000);
        mouseHoverToElement(womenMenu);
    }

    public void mouseHoverOnTops() throws InterruptedException {
        log.info("Mouse hover on Over women tops : " + womenTops.toString());
        Thread.sleep(1000);
        mouseHoverToElement(womenTops);
    }

    public void mouseHoverAndClickOnJackets() throws InterruptedException {
        log.info("Mouse hover on Over women jackets and click : " + womenJackets.toString());
        Thread.sleep(1000);
        mouseHoverToElementAndClick(womenJackets);
    }

    public void mouseHoverOnMenMenu() throws InterruptedException {
        log.info("Mouse hover on Over men menu : " + menMenu.toString());
        Thread.sleep(1000);
        mouseHoverToElement(menMenu);
    }

    public void mouseHoverOnBottoms() throws InterruptedException {
        log.info("Mouse hover on Over men Bottoms : " + menBottoms.toString());
        Thread.sleep(1000);
        mouseHoverToElement(menBottoms);
    }

    public void mouseHoverAndClickOnPants() throws InterruptedException {
        log.info("Mouse hover on Over men pants and click : " + menPants.toString());
        Thread.sleep(1000);
        mouseHoverToElementAndClick(menPants);
    }


    public void mouseHoverOnGearMenu() throws InterruptedException {
        log.info("Mouse hover on Over gear Menu : " + gearMenu.toString());
        Thread.sleep(1000);
        mouseHoverToElement(gearMenu);
    }

    public void mouseHoverAndClickOnBags() throws InterruptedException {
        log.info("Mouse hover on Over gear and click : " + gearMenu.toString());
        Thread.sleep(1000);
        mouseHoverToElementAndClick(gearBags);
    }
}
