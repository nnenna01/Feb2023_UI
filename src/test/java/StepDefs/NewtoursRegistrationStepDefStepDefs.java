package StepDefs;

import base.BaseUtil;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import pages2.NewtourGetNotePage;
import pages2.NewtourRegisterLink;
import pages2.NewtourRegistrationHomePage;
import utilities.EncapsulationClass;
import utilities.Utility;


import static org.hamcrest.CoreMatchers.equalTo;

import static org.hamcrest.MatcherAssert.assertThat;


public class NewtoursRegistrationStepDefStepDefs extends BaseUtil {

    private BaseUtil base;
    EncapsulationClass encapsulationClass;

    public NewtoursRegistrationStepDefStepDefs(BaseUtil base) {
        this.base = base;
    }
    @Given("I am on the Newtours website")
    public void iAmOnTheNewtoursWebsite() {
        base.driver.manage().window().maximize();
        base.driver.get("https://demo.guru99.com/selenium/newtours/");


    }
            @When("I click on the registration link")
            public void ClickOnTheRegistrationLink() {
                NewtourRegistrationHomePage newtourRegistrationHomePage= new NewtourRegistrationHomePage(base.driver);
                newtourRegistrationHomePage.clickOnRegisterButton();
                encapsulationClass = new EncapsulationClass();
                encapsulationClass.setRandNumbers(Utility.generateRandomNumbers());
                // encapsulationClass.setRandNumbers(1234);
                // Write code here that turns the phrase above into concrete actions

            }


//    @When("I enter Username, pword and confPWord as {string}, {string}, and {string}")
//    public void i_enter_username_pword_and_conf_p_word_as_and(String username, String password, String cPassword) {
//
//
//    }

    @When("I enter random email into the email address field")
    public void i_enter_random_email_into_the_email_address_field() throws InterruptedException {
        NewtourRegisterLink newtourRegisterLink =new NewtourRegisterLink(base.driver);
        WebElement UsernameLocator= base.driver.findElement(By.id("email"));
        UsernameLocator.sendKeys(encapsulationClass.getRandomNumbers()+ "yahoo.com");
        // Write code here that turns the phrase above into concrete actions
        Thread.sleep(4000);

    }

    @When("I press enter on the submit button")
    public void i_press_enter_on_the_submit_button() {
        NewtourRegisterLink newtourRegisterLink = new NewtourRegisterLink(base.driver);
        newtourRegisterLink.clickOnSubmitButton();


    }

    @Then("account is created")
    public void account_is_created() {
        NewtourGetNotePage newtourGetNotePage = new NewtourGetNotePage(base.driver);

        System.out.println("I will sort you out");
   // assertThat(newtourGetNotePage.getNoteMsg(), equalTo(true));


    }


    @And("I enter {string}, {string} and {string}")
    public void iEnterAnd(String Username, String pWord, String confPword) {
        NewtourRegisterLink newtourRegisterLink = new NewtourRegisterLink(base.driver);
        newtourRegisterLink.enterUsername(Username);
        newtourRegisterLink.enterPassWord(pWord);
        newtourRegisterLink.enterConfirmPassWord(confPword);

    }
}


