package com.luma.demo.pages;

import com.luma.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GearPage extends Utility
{
    private static final Logger log = LogManager.getLogger(GearPage.class.getName());

    public GearPage(){
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Overnight Duffle']")
    WebElement overnightDuffleElement;

    public void clickOnOvernightDuffleElement() throws InterruptedException {
        log.info("Click on Over night duffele : " + overnightDuffleElement.toString());
        Thread.sleep(1000);
        clickOnElement(overnightDuffleElement);
    }
}
