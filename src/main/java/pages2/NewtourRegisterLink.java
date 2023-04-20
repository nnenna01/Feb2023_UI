package pages2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class NewtourRegisterLink extends BasePage {
    public NewtourRegisterLink(WebDriver driver) {
        super(driver);
    }


@FindBy(id = "email") private WebElement userNameButtonLocator;

    @FindBy(name = "password") private WebElement passWordButtonLocator;

    @FindBy(name= "confirmPassword") private WebElement confirmPassWordLocator;

    @FindBy (name ="submit") private WebElement submitButtonLocator;






//////////////////METHODS/////////////////////




public void enterUsername(String Username) {
    userNameButtonLocator.sendKeys("userName");


        }
    public void enterPassWord(String pWord) {
        passWordButtonLocator.sendKeys("passWord");




        }
    public void enterConfirmPassWord(String confPword) {
        confirmPassWordLocator.sendKeys("confPword");
    }

    public void clickOnSubmitButton(){
        submitButtonLocator.click();

    }
}