package e2e.pages;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class YourCartInfoPage extends ProductsInfoPage{
    public YourCartInfoPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//div[@class='header_label']")
    public WebElement header;
    @FindBy(xpath = "//div[@class=/cart_list']")
    public WebElement cartList;
    @FindBy(xpath = "//div[@class='inventory_item_name']")
    public WebElement inventoryItemName;
    @FindBy(xpath = "//div[@class='inventory_item_price']")
    public WebElement inventoryItemPrice;
    @FindBy(xpath = "//*[@class='btn btn_secondary btn_small cart_button']")
    WebElement removeButton;
    @FindBy(xpath = "//*[@id='continue-shopping']")
    WebElement continueShoppingButton;
    @FindBy(xpath = "//*[@id='checkout']")
    WebElement checkoutButton;
    public void waitForOpen(){
        getWait().forVisibility(cartList);
        getWait().forVisibility(inventoryItemName);
        getWait().forVisibility(inventoryItemPrice);
        getWait().forVisibility(removeButton);
        getWait().forVisibility(continueShoppingButton);
        getWait().forClickable(checkoutButton);
    }
    public void InventoryAllItemsName(String[] args) {

    }
    public void InventoryItemPrice(String[] args){


    }


        public void clickCheckoutButton(){
        checkoutButton.click();
    }
}
