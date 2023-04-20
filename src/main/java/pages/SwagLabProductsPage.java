package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SwagLabProductsPage extends BasePage{
    public SwagLabProductsPage(WebDriver driver) {
        super(driver);
    }

@FindBy(id = "item_4_title_link") private WebElement productsLocator;
    // you can do it this way if you are using class directly
  //  @FindBy(css="div.inventory_details_name large_size") private WebElement productLocator;


//////////////method/////////////////////








public void clickOnFirstProduct(){
        productsLocator.click();

        }

        }