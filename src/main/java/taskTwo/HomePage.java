package taskTwo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

    //Attributes
    WebDriver browser;

    //Locators
    By searchBoxLocator = By.id("search_value");
    By searchBtnLocator = By.id("searchButton");

    //Elements
    WebElement searchBox;
    WebElement searchBtn;


    //Constructor
    public HomePage(WebDriver browser) {
        this.browser = browser;
        searchBox= browser.findElement(searchBoxLocator);
        searchBtn = browser.findElement(searchBtnLocator);
    }


    //Methods
    public void searchItem(String item){
        searchBox.sendKeys(item);
    }

    public void clickSearchBtn()
    {
        searchBtn.click();
    }

}
