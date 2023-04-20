package StepDefs;

import base.BaseUtil;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.*;
import utilities.PropertyReader;

import java.io.IOException;
import java.time.Duration;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.equalTo;

public class SwagLabStepDefs extends BaseUtil {
    private BaseUtil base;
    private SwagLabHomePage swagLabHomePage;
    SwagLabProductsPage swagLabProductsPage;
    InventoryItemPage inventoryItemPage;
    YourCartPage yourCartPage;
    CheckOutPage checkOutPage;
    OverViewPage overViewPage;
    CheckOutCompletePage checkOutCompletePage;


    public SwagLabStepDefs(BaseUtil base) {
        this.base = base;
    }

    public void initPages() {



        inventoryItemPage = new InventoryItemPage(base.driver);
        yourCartPage = new YourCartPage(base.driver);
        checkOutPage = new CheckOutPage(base.driver);
        overViewPage = new OverViewPage(base.driver);
        checkOutCompletePage = new CheckOutCompletePage(base.driver);
    }


//    @Given("I am on the swag lab home page")
//    public void iAmOnTheSwagLabHomePage() throws IOException {
//      base.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));//implicitWait
//        PropertyReader propertyReader = new PropertyReader();
//        base.driver.get(propertyReader.getSwagLabUrl());
 //   }

    @Given("I am on the swag lab home page")
    public void iAmOnTheSwagLabHomePage() {
        base.driver.manage().window().maximize();
        base.driver.get("https://www.saucedemo.com/");

    }
    @Given("I am on the swag lab home page {string}")
    public void i_am_on_the_swag_lab_home_page(String URL) {
        base.driver.manage().window().maximize();
        base.driver.get("https://.saucedemo.com/");


    }
    @When("I enter valid {string} and valid {string}")
    public void iEnterValidAndValid(String uName, String pWord) {
        SwagLabHomePage swagLabHomePage = new SwagLabHomePage(base.driver);
        swagLabHomePage.enterUserName(uName);
        swagLabHomePage.enterPassword(pWord);

    }


    @When("I click on Login button")
    public void i_click_on_login_button() {
        SwagLabHomePage swagLabHomePage = new SwagLabHomePage(base.driver);
        swagLabHomePage.clickOnLoginButton();

    }

    @When("I click on the first item on the Products page")
    public void i_click_on_the_first_item_on_the_products_page() {
       SwagLabProductsPage swagLabProductsPage = new SwagLabProductsPage(base.driver);
        swagLabProductsPage.clickOnFirstProduct();
    }

    @When("I click on Add to cart button")
    public void i_click_on_add_to_cart_button() {
       InventoryItemPage inventoryItemPage = new InventoryItemPage(base.driver);
        inventoryItemPage.clickOnAddToCart();

    }

    @When("I click on Shopping cart")
    public void i_click_on_shopping_cart() {

        inventoryItemPage.clickOnShoppingCart();
    }

    @When("I click on Checkout")
    public void i_click_on_checkout() {

        yourCartPage.clickOnCheckOutButton();
    }

    @When("I complete all the required fields")
    public void i_complete_all_the_required_fields(String fName, String lName, String Pcode) throws IOException {


//        checkOutPage.enterFirstName(fName);
//        checkOutPage.enterLastName(lName);
//        checkOutPage.enterPostalCode(Pcode);
        PropertyReader propertyReader = new PropertyReader();
        checkOutPage.enterFirstName(propertyReader.getFirstName());
        checkOutPage.enterLastName(propertyReader.getLastName());
        checkOutPage.enterPostalCode(propertyReader.getPostCode());

    }

    @When("I click on Continue button")
    public void i_click_on_continue_button(String cButton) {

        checkOutPage.clickOnContinueButton(cButton);
    }

    @When("I click on Finish button")
    public void i_click_on_finish_button() {

        overViewPage.clickOnFinishButton();
    }

    @Then("{string} message is displayed on the order confirmation page")
    public void message_is_displayed_on_the_order_confirmation_page(String Msg) {
        assertThat(checkOutCompletePage.getMessage().contains(Msg), equalTo(true));
    }

    @And("I enter details for only firstname and lastname")
    public void iEnterDetailsForOnlyFirstnameAndLastname() {
        
    }

    @Then("error msg {string} is displayed")
    public void errorMsgIsDisplayed(String arg0) {
        
    }

    @And("I enter details for only lastname and postcode")
    public void iEnterDetailsForOnlyLastnameAndPostcode() {
        
    }

    @And("I enter details for only firstname and postcode")
    public void iEnterDetailsForOnlyFirstnameAndPostcode() {
        
    }

    @When("I enter valid username")
    public void iEnterValidUsername() {

    }

    @And("I enter invalid password")
    public void iEnterInvalidPassword(){

  }

    @Then("error message is displayed and I am not logged in")
    public void errorMessageIsDisplayedAndIAmNotLoggedIn() {
        
    }

    @Then("{int} item is added to the cart")
    public void itemIsAddedToTheCart(int arg0) {
        
    }

    @When("I click on remove button")
    public void iClickOnRemoveButton() {
        
    }

    @Then("cart should have no item")
    public void cartShouldHaveNoItem() {
    }




//
//    @And("I enter details for only firstname and lastname")
//    public void iEnterDetailsForOnlyFirstnameAndLastname() {
//
//    }
//
//    @Then("error msg {string} is displayed")
//    public void errorMsgIsDisplayed(String msg) {
//
//        if (msg == "Error: Postal code is required") {
//
//        }
//        else if (msg == "Error: First Name is required") {
//
//        }
//        else if (msg == "Error: Last Name is required") {
//
//        }
//    }
//
//    @And("I enter details for only lastname and postcode")
//    public void iEnterDetailsForOnlyLastnameAndPostcode() {
//
//    }


//
//    @And("I enter details for only firstname and postcode")
//    public void iEnterDetailsForOnlyFirstnameAndPostcode() {
    }
//Waits  FOR SELENIUM : IMPLICIT AND EXPLICIT WAIT
// Explicit wait: base.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));//implicitWait
// This wits for the stated number of seconds before it moves on after every action.  WHILE
//EXPLICIT WAIT
///this is to tell the sySTEMto wait till something is either visible or something appears.
////most times, Selenium might fail because it did not see the webElement. iT IS IMPLICITE BECAUSE IT WILL ALWYS WIT UNTILSOME WEBELEMENTS ARE DISPLAYED
////