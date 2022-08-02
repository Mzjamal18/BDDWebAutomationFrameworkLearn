package pages;

import configuration.common.WebTestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static configuration.common.GlobalReUsableMethods.clickOnElement;
import static configuration.common.GlobalReUsableMethods.enterValueOnElement;
import static pageelements.HomePageElements.*;

public class HomePage extends WebTestBase {
    public HomePage(){
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = searchBoxWebElement)
    public WebElement searchBox;
    @FindBy(xpath = searchButtonWebElement)
    public WebElement searchButton;
    @FindBy(xpath = verifySearchedProductWebElement)
    public WebElement verifySearchedProduct;


    // Search Product
    public void searchValidProduct(String productName) {
        //  searchBox.sendKeys("");
        enterValueOnElement(searchBox, productName);
        clickOnElement(searchButton);
    }

    public void enterProductName(String productName){
        enterValueOnElement(searchBox, productName);
    }

    public void clickOnSearchButton(){
        clickOnElement(searchButton);
    }

}
