import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import taskTwo.HomePage;
import taskTwo.SearchResultsPage;

public class TestCases extends Basics {
    HomePage souqeHome;
    SearchResultsPage resultPage;
    String item;

    @BeforeTest
    public void beforeTest() {
        souqeHome = new HomePage(browser);
        item = "iphone";
    }

    @Test
    public void extractingItemsFromSearchResults() {
        souqeHome.searchItem(item);
        souqeHome.clickSearchBtn();
        resultPage = new SearchResultsPage(browser);
        resultPage.extractFirst20ResultsDetails();
        resultPage.writeItemsDataToJasonFile();

    }
}
