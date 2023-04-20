package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckOutCompletePage extends BasePage {
    public CheckOutCompletePage(WebDriver driver) {
        super(driver);
    }


    @FindBy(css = ".complete-header")
    private WebElement ThankYouMessageLocator;


//////////////////METHODS/////////////////////

//you do not do assertion in the page object  page . REMEMBER! When you used String,
// Remember to use Return in from of whatever you want to do
    // or when you use the boolean, you also need to Return


    public String getMessage() {
    return ThankYouMessageLocator.getText();


    }

}