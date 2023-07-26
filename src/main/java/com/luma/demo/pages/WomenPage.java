package com.luma.demo.pages;

import com.luma.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WomenPage extends Utility
{
    private static final Logger log = LogManager.getLogger(WomenPage.class.getName());

    public WomenPage(){
        PageFactory.initElements(driver, this);
    }
    // Storing jackets names in list
    By jacketsNameListBeforeSorting = By.xpath("//strong[@class='product name product-item-name']//a");


    // Select Sort By filter “Product Name”

    @FindBy(xpath = "(//select[@id='sorter'])[1]")
    WebElement filterProductName;

    // After Sorting value
    By jacketsNameListAfterSorting = By.xpath("//strong[@class='product name product-item-name']//a");


    // Storing jackets price in list
    By jacketsPriceListBeforeSorting = By.xpath("//span[@class='price-wrapper ']//span");

    //  filter “Price”

    @FindBy(xpath = "(//select[@id='sorter'])[1]")
    WebElement filterPrice;

    // After Sorting Products by Price
    By jacketsPriceListAfterSorting = By.xpath("//span[@class='price-wrapper ']//span");


    public List<String> productListBeforeSorting() {
        List<WebElement> jacketsElementsList = driver.findElements( jacketsNameListBeforeSorting);
        List<String> jacketsNameListBefore = new ArrayList<>();
        for (WebElement value : jacketsElementsList) {
            jacketsNameListBefore.add(value.getText());
        }
        // Sort the before name list into Ascending Order
        jacketsNameListBefore.sort(String.CASE_INSENSITIVE_ORDER);// Ascending order
        return jacketsNameListBefore;
    }

    public List<String> productListAfterSorting() throws InterruptedException {
        Thread.sleep(1000);
        // Select Sort By filter “Product Name”
        log.info("Select sort by product name : " + filterProductName.toString());
        selectByVisibleTextFromDropDown(filterProductName, "Product Name");
        Thread.sleep(1000);
        // After Sorting value
        List<WebElement> jacketsElementsList = driver.findElements( jacketsNameListAfterSorting);
        List<String> jacketsNameListAfter = new ArrayList<>();
        Thread.sleep(1000);
        for (WebElement value : jacketsElementsList) {
            jacketsNameListAfter.add(value.getText());
        }
        return jacketsNameListAfter;
    }

    public List<Double> priceListBeforeSorting() {
        // Storing jackets price in list
        List<WebElement> jacketsPriceElementList = driver.findElements( jacketsPriceListBeforeSorting);
        List<Double> jacketsPriceListBefore = new ArrayList<>();
        for (WebElement value : jacketsPriceElementList) {
            //Converting price in to Double and Removing $ from price
            jacketsPriceListBefore.add(Double.valueOf(value.getText().replace("$", "")));
        }
        // Sort the jacketPriceListBefore to Ascending Order
        Collections.sort(jacketsPriceListBefore);
        return jacketsPriceListBefore;
    }


    public List<Double> priceListAfterSorting() throws InterruptedException {
        Thread.sleep(1000);
        // Select Sort By filter “Price”
        log.info("Select sort by product price : " + filterPrice.toString());
        selectByVisibleTextFromDropDown(filterPrice, "Price");
        Thread.sleep(1000);
        // After Sorting Products by Price
        List<WebElement> jacketsPriceElementList = driver.findElements( jacketsPriceListAfterSorting);
        List<Double> jacketsPriceListAfter = new ArrayList<>();
        Thread.sleep(1000);
        for (WebElement value : jacketsPriceElementList) {
            //Converting price in to Double and Removing $ from price
            jacketsPriceListAfter.add(Double.valueOf(value.getText().replace("$", "")));
        }
        return jacketsPriceListAfter;
    }
}
