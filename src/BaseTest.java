import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
 
public class BaseTest {
    public static WebDriver driver;
 
    @BeforeClass
    public static void setup() {
    	System.setProperty("webdriver.chrome.driver","/Users/mariana/chromedriver");  
        driver = new ChromeDriver();
 
        //Maximize Window
        driver.manage().window().maximize();
    }
 
    @AfterClass
    public static void teardown () {
        driver.quit();
    }
}





