package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InventoryItemPage extends BasePage{
    public InventoryItemPage(WebDriver driver) {
        super(driver);
    }


@FindBy(id="add-to-cart-sauce-labs-backpack") private WebElement addToCartButtonLocator;


    @FindBy(css=".shopping_cart_link")private WebElement shoppingCartLocator;

//////////METHODS/////////////////////////////////





public void clickOnAddToCart() {
    addToCartButtonLocator.click();

}
    public void clickOnShoppingCart(){
        shoppingCartLocator.click();


        }

        }