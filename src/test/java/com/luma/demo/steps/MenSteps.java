package com.luma.demo.steps;

import com.luma.demo.pages.HomePage;
import com.luma.demo.pages.MenPage;
import com.luma.demo.pages.ShoppingCartPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class MenSteps
{
    @When("I Mouse Hover on Men Menu")
    public void iMouseHoverOnMenMenu() throws InterruptedException {
        new HomePage().mouseHoverOnMenMenu();
    }

    @And("I Mouse Hover on Bottoms")
    public void iMouseHoverOnBottoms() throws InterruptedException {
        new HomePage().mouseHoverOnBottoms();
    }

    @And("I click on Pants")
    public void iClickOnPants() throws InterruptedException {
        new HomePage().mouseHoverAndClickOnPants();
    }

    @And("I mouse hover on product name Cronus Yoga Pant and click on size")
    public void iMouseHoverOnProductNameCronusYogaPantAndClickOnSize() throws InterruptedException {
        new MenPage().mouseHoverOnCronusYogaPantsAndClickOn32();
    }

    @And("I mouse Hover on product name Cronus Yoga Pant and click on colour Black")
    public void iMouseHoverOnProductNameCronusYogaPantAndClickOnColourBlack() throws InterruptedException {
        new MenPage().mouseHoverOnCronusYogaPantsAndClickOnBlack();
    }

    @And("I Mouse Hover on product name Cronus Yoga Pant and click on Add to cart button")
    public void iMouseHoverOnProductNameCronusYogaPantAndClickOnAddToCartButton() throws InterruptedException {
        new MenPage().mouseHoverOnCronusYogaPantsAndClickOnAddToCart();
    }

    @Then("I verify the text {string}")
    public void iVerifyTheText(String expectedText) {
        Assert.assertEquals(expectedText,new MenPage().getAddedToCartMessage(), "The added to cart message is not displayed");
    }

    @And("I click on Shopping cart link into message")
    public void iClickOnShoppingCartLinkIntoMessage() {
        new MenPage().clickOnShoppingCartElement();
    }

    @Then("I verify the text of {string}")
    public void iVerifyTheTextOf(String expectedText) {
      Assert.assertEquals(expectedText, new ShoppingCartPage().getShoppingCartText(), "Shopping cart text element is not displayed");
    }


    @Then("I verify the product name {string}")
    public void iVerifyTheProductName(String expectedMessage) {
        Assert.assertEquals(expectedMessage, new ShoppingCartPage().getCronusYogaPantText(), "Cronus Yoga Pant text element is not displayed");
    }

    @Then("I Verify the product size {string}")
    public void iVerifyTheProductSize(String expectedText) {
        Assert.assertEquals(expectedText, new ShoppingCartPage().getSize32Text(), "'32' text element is not displayed");
    }

    @Then("I verify the product colour {string}")
    public void iVerifyTheProductColour(String expectedText) {
        Assert.assertEquals(expectedText, new ShoppingCartPage().getColourBlackText(), "'Black' text element is not displayed" );
    }
}
