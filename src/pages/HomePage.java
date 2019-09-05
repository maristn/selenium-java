package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class HomePage extends BasePage {

	//*********Constructor*********
	public HomePage (WebDriver driver) {
		super(driver);
	}

	//*********Page Variables*********
	String baseURL = "http://Thuisbezorgd.nl";
	String zipCode = "8889AA";

	//*********Web Elements*********
	By zipCodeBy = By.id("imysearchstring");
	By submitButtonBy = By.id("submit_deliveryarea");

	//*********Page Methods*********
	//Go to Homepage
	public HomePage goToTakeawayPage (){
		driver.get(baseURL);
		return this;
	}
	
	//Search for ZipCode 
	public HomePage SearchZipCodeAndSubmit (){
		writeText(zipCodeBy, zipCode);
		click(submitButtonBy);
		return this;
	}
}