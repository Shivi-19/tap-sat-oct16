/**
* This is a sample test 
* Step 1 : Open snapdeal.com/amazon.com/flipcart.com
* Step 2 : Search A product - Mobile
* Step 3 : Select First Product
* Step 4 : Add the product to cart
* Step 5 : Verify the product has been added to cart
* 
* Task : Stubs are already written , you have to implement them and run this test
*/

package com.qait.demo.tests;

import static com.qait.automation.utils.YamlReader.getYamlValue;

import java.lang.reflect.Method;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qait.automation.TestSessionInitiator;
import com.qait.automation.utils.YamlReader;

public class TestLevel2_GenericEcommerseSiteTest_Stubs_Written_Method_Needs_To_Be_Implemented {

	TestSessionInitiator test;
	String baseUrl;
	String product_name;

	@BeforeClass
	public void Start_Test_Session() {
		test = new TestSessionInitiator(this.getClass().getSimpleName());
		initVars();
		test.launchApplication(baseUrl);
	}

	@BeforeMethod
	public void handleTestMethodName(Method method) {
		test.stepStartMessage(method.getName());
	}

	private void initVars() {
		baseUrl = getYamlValue("baseUrl");
	}
	//new1
	@Test()
	public void TestStep01_VerifyHomePage(){
		test.homePage.verifyLogo();	
		
	}
	
	
		
	@Test()
	public void TestStep02_SearchProduct(){
		test.homePage.enterProductName(getYamlValue("productName"));
		test.homePage.clickSearchIcon();
	}
	
	//New2
	@Test() 
	 public void TestStep02_Verify_User_Is_Able_To_View_Ratings_Of_The_Product(){
	  test.homePage.verify_User_Is_Able_To_View_Ratings();
	  
	 }
	
	//New3	
	@Test() 
	 public void TestStep02_Verify_Feilds_Are_Expandable(){
	  test.homePage.verify_User_Is_Able_To_Expand_The_BrandOptions();
	 }
	
	 
	
	
	 //New4
	 @Test() 
	 public void TestStep02_Verify_Select_Dropdown_Is_Present(){
	  test.homePage.verify_User_Is_Able_To_View_Select_Disciplin_With_NoDisciplin_Selected_Initaially();
	 }

	 
	 
	//new6
	@Test()
	public void TestStep03_VerifySearchResultPage(){
		test.resultPage.verifyResultsPage(getYamlValue("productName"));
	}
	
	@Test()
	public void TestStep04_VerifySearchResult(){
		test.resultPage.verifyResults(getYamlValue("productName"));
	}
	
	@Test()
	public void TestStep05_SelectFirstProduct(){
		product_name=test.resultPage.getProductName();
		test.resultPage.clickFirstProduct();
	}
	
		
	//New7
	@Test()
	public void TestStep06_VerifyProductInfo(){
		test.productDetailsPage.verifyProductInfo();
		
	}
	
	
	  //New8
        @Test()
		public void TestStep07_VerifyProductName(){
		
			test.productDetailsPage.verifyProductName(product_name);
			
		}
		
		
	@Test()
	public void TestStep08_AddProductToCart(){
		test.productDetailsPage.AddTheProductToCart();
	}
	
	@Test()
	public void TestStep09_VerifyCart(){
		test.cartPage.verifyCart();
	}
	
	
	@Test  
	 public void TestStep09_Verify_Similar_Products_Are_Presnt_For_Product_Details_Page(){
	  test.cartPage.Verify_User_Is_Able_To_View_Similar_Items();
	 }
	 
	 @Test() 
	 public void TestStep10_Verify_User_Is_Able_To_Buy_The_Product(){
	  test.cartPage.verify_User_Is_Able_To_Buy_Product();
	 }
	 
	 @Test() 
	 public void TestStep11_Verify_User_Navigated_To_Shipping_Page(){
	  test.cartPage.verify_User_Navigated_To_Shipping_Cart_Page();
	 }
	 
	
	
//	
//	
//	
//	
//	
//	@Test()
//	public void TestStep09_VerifyCart(){
//		test.cartPage.verifyCart();
//	}
	
		
	
	@AfterMethod
	public void take_screenshot_on_failure(ITestResult result) {
		test.takescreenshot.takeScreenShotOnException(result);
	}

	//@AfterClass
	public void close_Test_Session() {
		test.closeBrowserSession();
	}

}
