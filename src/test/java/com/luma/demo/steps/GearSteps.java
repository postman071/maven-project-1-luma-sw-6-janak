package com.luma.demo.steps;

import com.luma.demo.pages.GearPage;
import com.luma.demo.pages.HomePage;
import com.luma.demo.pages.OverNightDufflePage;
import com.luma.demo.pages.ShoppingCartPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class GearSteps
{
    @When("I mouse hover on gear menu")
    public void iMouseHoverOnGearMenu() throws InterruptedException {
        new HomePage().mouseHoverOnGearMenu();
    }

    @And("I click on bags")
    public void iClickOnBags() throws InterruptedException {
        new HomePage().mouseHoverAndClickOnBags();
    }

    @And("I click on product name Overnight Duffle")
    public void iClickOnProductNameOvernightDuffle() throws InterruptedException {
        new GearPage().clickOnOvernightDuffleElement();
    }

    @And("I change the quantity {string}")
    public void iChangeTheQuantity(String quantity) throws InterruptedException {
        new OverNightDufflePage().sendQtyToInputQuantityBox(quantity);
    }

    @And("I click on Add to cart button")
    public void iClickOnAddToCartButton() throws InterruptedException {
        new OverNightDufflePage().clickOnOverAddToCartButton();
    }

    @Then("I verify the text of the product {string}")
    public void iVerifyTheTextOfTheProduct(String expectedText) throws InterruptedException {
        Assert.assertEquals(expectedText, new OverNightDufflePage().getAddedToCartMessage());
    }

    @And("I click on shopping cart link into message")
    public void iClickOnShoppingCartLinkIntoMessage() throws InterruptedException {
        new OverNightDufflePage().clickOnShoppingCartElement();
    }

    @Then("I verify product name {string}")
    public void iVerifyProductName(String expectedText) throws InterruptedException {
        Assert.assertEquals(expectedText, new ShoppingCartPage().getTextProductNameTextElement());
    }


    @Then("I verify the quantity {string}")
    public void iVerifyTheQuantity(String expectedText) throws InterruptedException {
       Assert.assertEquals(expectedText, new ShoppingCartPage().getInputQty());
    }

    @Then("I Verify the product price {string}")
    public void iVerifyTheProductPrice(String expectedText) throws InterruptedException {
        Assert.assertEquals(expectedText, new ShoppingCartPage().getProductPrice());
    }

    @And("I Change quantity to {string}")
    public void iChangeQuantityTo(String qty) throws InterruptedException {
        new ShoppingCartPage().sendQtyToUpdateInQuantityBox(qty);
    }

    @And("I click on update shopping cart button")
    public void iClickOnUpdateShoppingCartButton() throws InterruptedException {
        new ShoppingCartPage().clickUpdateShoppingCartButton();
    }

    @Then("I Verify the price of the product {string}")
    public void iVerifyThePriceOfTheProduct(String expectedText) throws InterruptedException {
        Assert.assertEquals(expectedText, new ShoppingCartPage().getUpdatedProductPrice());
    }
}
