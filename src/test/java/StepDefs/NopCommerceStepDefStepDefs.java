package StepDefs;

import base.BaseUtil;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.*;

import java.util.List;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class NopCommerceStepDefStepDefs extends BaseUtil {
    private BaseUtil base;

    public NopCommerceStepDefStepDefs(BaseUtil base) {
        this.base = base;
    }

    @Given("I am on  the nopcommerce website {string}")
    public void i_am_on_the_nopcommerce_website(String URL) {
        base.driver.manage().window().maximize();
        base.driver.get ("https://demo.nopcommerce.com/");
    }
    @When("I navigate to the Desktop page")
    @When("I navigate to the Desktop page via mouse hoover")
    public void i_navigate_to_the_desktop_page_via_mouse_hoover() {
      List <WebElement> ComputersMenu = base.driver.findElements(By.xpath("(//a[contains(text(),'Computers')]) [1]"));

      new Actions(base.driver).
              moveToElement(ComputersMenu.get(1)).
              perform();


        List <WebElement> DesktopSubMenu = base.driver.findElements(By.linkText("Desktop"));
      DesktopSubMenu.get(1).click();
    }

    @Then("Desktop page is displayed")
    public void desktop_page_is_displayed()
            throws InterruptedException {Thread.sleep(4000);
        // Write code here that turns the phrase above into concrete actions
        System.out.println("hello am done");
    }



}