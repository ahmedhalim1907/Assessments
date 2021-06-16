import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basics {
    //Attributes
    WebDriver browser;



    //Constructor
    public Basics() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/driver/chromedriver.exe");
        browser = new ChromeDriver();
        browser.get("https://egypt.souq.com/eg-en/");
        browser.manage().window().maximize();

    }

    @AfterClass
    public void afterClass() {
        browser.quit();
    }
}
