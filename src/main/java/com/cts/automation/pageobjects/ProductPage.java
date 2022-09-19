package com.cts.automation.pageobjects;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cts.automation.base.HelperClass;

public class ProductPage extends HelperClass
{
	public ProductPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div[text()='Price -- Low to High']")
	public WebElement lnkPrice;
	
	@FindBy(xpath="//div[@class='_30jeq3 _1_WHN1']")
	public List<WebElement> mobilePrice;
	
	
	public void productSorting() throws InterruptedException 
	{
		lnkPrice.click();
	    Thread.sleep(3000);
	     for(WebElement local : mobilePrice) 
		{
		   String allPrice = local.getText();
		   //allPrice = allPrice.replace("?", "").replace(",", "");
		 //  int mobilePrice = Integer.valueOf(allPrice);
		   //System.out.println(allPrice);
		}
	     List<String>allMobilePrice = new ArrayList<String>(); 
	     List<String>tempLi = new ArrayList<String>(allMobilePrice);
	     Collections.sort(tempLi);
	     if(allMobilePrice.equals(tempLi))
	     {
	    	System.out.println("Sorting functionality working properly"); 
	    	 }
	     else
	     {
	    	 System.out.println("Sorting functionality working improperly");
	     }
	     
	     
	
}}
