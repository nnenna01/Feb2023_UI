package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckOutPage extends BasePage {
    public CheckOutPage(WebDriver driver) {
        super(driver);
    }


    @FindBy(id = "first-name")
    private WebElement firstnameLocator;
    @FindBy(id = "last-name")
    private WebElement lastNameLocator;
    @FindBy(id = "postal-code")
    private WebElement postalCodeLocator;
    @FindBy(id = "continue")
    private WebElement continueLocator;






    /////////methods//////////



    public void enterFirstName(String fName) {
        firstnameLocator.sendKeys(fName);

    }
        public void enterLastName(String lName) {
            lastNameLocator.sendKeys(lName);
        }

        public void enterPostalCode (String pCode) {
            postalCodeLocator.sendKeys(pCode);
        }

            public void clickOnContinueButton (String pCode) {
                continueLocator.click();


            }

    }

