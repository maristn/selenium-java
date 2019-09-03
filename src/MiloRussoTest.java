import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test; 
import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.Keys;


class MiloRussoTest {

	private WebDriver browser;

	public MiloRussoTest() {
		System.setProperty("webdriver.chrome.driver","/Users/mariana/chromedriver");   
		browser = new ChromeDriver();     		
	}

	public void waitElementById(String field) {
		WebDriverWait wait = new WebDriverWait(browser, 10); 

		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.id(field)));
		element.click();

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void waitElementByLinkText(String field) {
		WebDriverWait wait = new WebDriverWait(browser, 10); 

		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.linkText(field)));
		element.click();

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Test
	public void navigateOnSite()  {   

		String baseUrl = "http://Thuisbezorgd.nl";
		String zipCode = "8889AA";
		String submitButton = "Zoek";
		String restaurant = "QA Restaurant Selenium";
		String coke = "QQ010PNRN";

		browser.get(baseUrl);       
		browser.findElement(By.id("imysearchstring")).sendKeys(zipCode);

		waitElementByLinkText(submitButton);
		waitElementByLinkText(restaurant);
		waitElementById(coke);



		browser.close();

	}
}