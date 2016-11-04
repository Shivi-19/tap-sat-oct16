package com.qait.demo.keywords;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.events.WebDriverEventListener;
import org.testng.Assert;

import com.qait.automation.getpageobjects.GetPage;
import com.qait.automation.utils.YamlReader;
import com.thoughtworks.selenium.Wait;
import com.thoughtworks.selenium.Wait.WaitTimedOutException;

public class ProductDetailsActions extends GetPage {

	WebDriver driver;
	private EventFiringWebDriver e_driver;

	public ProductDetailsActions(WebDriver driver) {
		super(driver, "HomePage");
		this.driver = driver;

	}

	public void AddTheProductToCart() {
//		System.out.println("1");
//		for(String winHandle : driver.getWindowHandles()){
//			System.out.println("2");
//	         driver.switchTo().window(winHandle);
//	         System.out.println("3");
//	     }
//		System.out.println("4");
//	 ((JavascriptExecutor) driver).executeScript("document.getElementsByClassName('col-xs-6 btn btn-xl btn-theme-secondary rippleWhite buyLink')[0].click();");
//	  
//	 System.out.println("5");
//		
		
		
		
		
	element("flipkart_add_cart").click();
	element("flipkart_go_cart").click();	
	 }

	public void verifyProductInfo() {
		
		
		
		Assert.assertTrue(element("flipkart_product_feature").isDisplayed(), "[ASSERT FAILED]: Product detail not Found");
		
	}

	public void verifyProductName(String product_name) {
		String text = element("flipkart_product_name_on_detail").getText();
		System.out.println("text"+text);
		Assert.assertTrue(text.equalsIgnoreCase(product_name), "[ASSERT FAILED]: Product name is not correct");
		
	}
		
}
