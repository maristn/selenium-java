package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RestaurantsPage extends BasePage {
	
	//*********Constructor*********
	public RestaurantsPage (WebDriver driver) {
		super(driver);
	}
	
	//*********Page Variables*********
	String restaurant = "QA Restaurant Selenium";

	//*********Web Elements*********
	By restaurantBy = By.linkText("QA Restaurant Selenium");

	//*********Page Methods*********
	//Search for Restaurant
	public RestaurantsPage SearchRestaurant() {
		click(restaurantBy);
		return this;
	}
}
