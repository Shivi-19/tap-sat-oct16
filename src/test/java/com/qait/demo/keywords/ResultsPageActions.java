package com.qait.demo.keywords;



import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.qait.automation.getpageobjects.GetPage;

public class ResultsPageActions extends GetPage {
	
	WebDriver driver;

    public ResultsPageActions(WebDriver driver) {
        super(driver, "ResultsPage");
        this.driver = driver;
    }

	
	public void verifySearchResults(String resultText) {
		isElementDisplayed("area_searchResult");
		Assert.assertTrue(element("txt_resultCount",resultText).isDisplayed(), "Result count section is not present");
		logMessage("Search Results successfully displayed");
	}
	
	
	public void getResponseCode(String url){
		logMessage("Status Code for the URL '"+url+"' :- "+ apiTester.getStatusCodeOfTheService(url));
	}

	public void getHeaders(String url){
		Map<String, List<String>> map = apiTester.getAllHeaderFields(url);
		Iterator it = map.entrySet().iterator();
		while(it.hasNext()){
			logMessage("Map value:- "+it.next());
		}
	}


	public void clickFirstProduct() {
		//element("first_product").click(); 
		element("flipkart_first_product").click();
		
	}


	public void verifyResults(String yamlValue) {
		
		//Assert.assertTrue(element("sort").isDisplayed(), "[ASSERT FAILED]: Search Results not Found");
		Assert.assertTrue(element("flipkart_sort_button").isDisplayed(), "[ASSERT FAILED]: Search Results not Found");
	
	}


	public void verifyResultsPage(String yamlValue) {
		System.out.println("yamlValue"+yamlValue);
		String text = element("flipcart_searchkey").getText();
		System.out.println("text"+text);
		//Assert.assertTrue(text.equals(yamlValue), "[ASSERT FAILED]: Search Results not Correct");
		Assert.assertTrue(text.equalsIgnoreCase(yamlValue), "[ASSERT FAILED]: Search Results not Correct");
		// TODO Auto-generated method stub
		
	}


	public String getProductName() {
		String product_name=element("flipkart_product_name").getText();
		return product_name;
	}


	


	
	
	
    
    
}
