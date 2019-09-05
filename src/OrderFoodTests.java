import org.junit.Test;
import pages.HomePage;
import pages.MenuPage;
import pages.RestaurantsPage;

public class OrderFoodTests extends BaseTest{

	@Test
	public void MakeOrder () throws InterruptedException {
		//*************PAGE INSTANTIATIONS*************
		HomePage homePage = new HomePage(driver);
		RestaurantsPage restaurantsPage = new RestaurantsPage(driver);
		MenuPage menuPage = new MenuPage(driver);


		//*************PAGE METHODS********************
		homePage.goToTakeawayPage()
				.SearchZipCodeAndSubmit();
		
		restaurantsPage.SearchRestaurant();
		
		menuPage.FillCart();
	}
}
