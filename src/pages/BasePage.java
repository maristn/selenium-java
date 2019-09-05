package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
    public WebDriver driver;
    public WebDriverWait wait;
 
    //Constructor
    public BasePage (WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver,15);
    }
 
    //Wait Wrapper Method
    public void waitVisibility(By elementBy) {
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(elementBy));
    }
    
    public void showVisibility(By elementBy) {
	    try {
	    	
	    	Thread.sleep(5000);
	    	//driver.wait(15);
	    }
	    catch(Exception e) {
	    	
	    }
    	
    	
    	
    	if (driver.findElement(elementBy).isDisplayed()) {
    		System.out.println(elementBy + driver.findElement(elementBy).getTagName());
    		System.out.println(elementBy + driver.findElement(elementBy).getText());
    	}
    }
 
    //Click Method
    public void click (By elementBy) {
        waitVisibility(elementBy);
        driver.findElement(elementBy).click();
    }
    
    //Execute JavaScript
    public void clickJavascript (String elementBy,String element) {
    	if (elementBy == "id") {
        	JavascriptExecutor js = (JavascriptExecutor) driver;	
        	js.executeScript("document.getElementById('"+element+"').click();");
    		}
    	else if (elementBy == "className") {
        	JavascriptExecutor js = (JavascriptExecutor) driver;	
        	System.out.println("document.getElementsByClassName('"+element+"').click();");
        	js.executeScript("document.getElementsByClassName('"+element+"').click();");

    		}
    }
 
    //Write Text
    public void writeText (By elementBy, String text) {
        waitVisibility(elementBy);
        driver.findElement(elementBy).sendKeys(text);
    }
 
    //Read Text
    public String readText (By elementBy) {
        waitVisibility(elementBy);
        return driver.findElement(elementBy).getText();
    }
 
    //Assert
    public void assertEquals (By elementBy, String expectedText) {
        waitVisibility(elementBy);
        Assert.assertEquals(readText(elementBy), expectedText);
 
    }
}