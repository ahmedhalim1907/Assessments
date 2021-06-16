package taskTwo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class SearchResultsPage {
    //Attributes
    WebDriver browser;
    final int size = 5;

    //Locators
    By resultLocator = By.className("itemTitle");
    By itemPriceLocator = By.className("itemPrice");

    //Elements
    List<WebElement> listOfResultsNames;
    List<WebElement> listOfItemPrice;
    String[] itemsNames;
    String[] itemsPrices;


    //Constructor
    public SearchResultsPage(WebDriver browser) {
        this.browser = browser;
        WebDriverWait wait = new WebDriverWait(browser, 60);
        wait.until(ExpectedConditions.visibilityOf(browser.findElement(resultLocator)));
        listOfResultsNames = browser.findElements(resultLocator);
        listOfItemPrice = browser.findElements(itemPriceLocator);
        itemsNames = new String[size];
        itemsPrices = new String[size];

    }


    //Methods
    public void extractFirst20ResultsDetails() {
        for (int i = 0; i < size; i++) {
            itemsNames[i] = listOfResultsNames.get(i).getText();
            itemsPrices[i] = listOfItemPrice.get(i).getText();
        }

    }

    public void writeItemsDataToJasonFile() {
        for (int i = 0; i < itemsNames.length; i++) {
            JsonHandler.addItemDetails(itemsNames[i], itemsPrices[i]);
            JsonHandler.writeItemsDetailsOnJsonFile();

            // System.out.println(itemsNames[i]);
            // System.out.println(itemsPrices[i]);

        }

    }


}
