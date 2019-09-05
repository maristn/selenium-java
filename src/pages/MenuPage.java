package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MenuPage extends BasePage{
	
	//*********Constructor*********
	public MenuPage (WebDriver driver) {
		super(driver);
	}
	
	//*********Page Variables*********
	String comment = "QA Restaurant Selenium";
	String mealDealsDuckBreastTomato = "isidedish_Q3PQ3N0PR";
	String addButton = "button_add_value";
	
	//*********Web Elements*********
	By drinkCoke = By.id("QQ010PNRN");
	By mealDealsDuckBreast = By.id("Q1N30PNRN");	
	
	
	
	//By pizzaSalami = By.id("QON30PNRN");
	//By editCokeCommentButton = By.className("cart-meal-edit-comment");
	//By editComment = By.id("commentinput-Q1N30PNRN-QNOQ3N0PR");
	//By orderButton = By.className("basket__order-button cartbutton-button");
	
	//*********Page Methods*********
	public MenuPage FillCart() throws InterruptedException {
		
		click(drinkCoke);
		click(mealDealsDuckBreast);
		Thread.sleep(2000);
		clickJavascript("id",mealDealsDuckBreastTomato);
		clickJavascript("className",addButton);
		

//			List<WebElement> lst = tomato.findElements(By.tagName("label"));
//			
//			System.out.println(lst.size());
//			Thread.sleep(2000);
//			//System.out.println(lst.size());
//			for(int i = 0; i < lst.size();i++) {
//				System.out.println(lst.get(i).getText());
//				if(lst.get(i).getText().equals("Tomato"))
//					lst.get(i).click();
//				
//				
//			}
			//tomato.findElement(By.partialLinkText("mato")).click();
			//lst.get(2).click();
				//System.out.println(lst.get(i).getAttribute("type"));
			Thread.sleep(5000);
		
		//System.out.println(tomato.getText());
		
		//By tomato = mealDealsDuckBreast.id("isidedish_QPPQ3N0PR");
		

		//showVisibility(sideDishe);
		//showVisibility(sideDisheSalad);	
		//showVisibility(tomato);		
		//showVisibility(mealDealsDuckBreastTomato);
		
		//click(sideDisheSalad);	
		//clickForm(sideDishe,sideDisheSalad,mealDealsDuckBreastTomato);
		//click(addButton);
		//click(pizzaSalami);
		//click(editCokeCommentButton);
		//writeText(editComment, comment);
		//click(orderButton);
		return this;
	}
}


