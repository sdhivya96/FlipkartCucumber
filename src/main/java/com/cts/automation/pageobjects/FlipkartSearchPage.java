package com.cts.automation.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlipkartSearchPage {
	
	public FlipkartSearchPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//button[@class='_2KpZ6l _2doB4z']")
	public WebElement btnLogin;
	
	@FindBy(xpath="//input[@class='_3704LK']")
	public WebElement searchTab;
	
	@FindBy(xpath="//button[@class='L0Z3Pu']")
	public WebElement btnClick;
	
	public void searchProduct(String category) 
	{
		btnLogin.click();
		searchTab.sendKeys(category);
		btnClick.click();

	}
	
	
	
	
	
	
	
	
	
	
	
	

}
