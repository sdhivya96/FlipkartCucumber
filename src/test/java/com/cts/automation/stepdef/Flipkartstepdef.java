package com.cts.automation.stepdef;

import com.cts.automation.base.HelperClass;
import com.cts.automation.pageobjects.FlipkartSearchPage;
import com.cts.automation.pageobjects.ProductPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Flipkartstepdef extends HelperClass{
	
	@Given("User launches chrome and navigates to flipkart")
	public void launchChrome() 
	{
	    launchBrowser();
	    driver.get("https://www.flipkart.com/");
	}

	@When("User enters {string} and clicks search")
	public void productSearch(String category)
	{
	    FlipkartSearchPage search = new FlipkartSearchPage(driver);
	    search.searchProduct(category);
	}

	@When("user clicks price-low to high")
	public void sortingPrice() throws InterruptedException
	{
	    ProductPage page = new ProductPage(driver);
	    page.productSorting();
	}

	@Then("user compares the sorting result with the last mobile")
	public void compareResults() 
	{
	    
	
	

}
	}
