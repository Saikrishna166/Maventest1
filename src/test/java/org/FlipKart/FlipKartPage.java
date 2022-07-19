package org.FlipKart;

import org.base.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlipKartPage extends BaseClass {
	
	public FlipKartPage() {
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//button[@class='_2KpZ6l _2doB4z']")
	private WebElement closed;

	public WebElement getClosed() {
		return closed;
	}
	@FindBy(name="q")
	private WebElement search;

	public WebElement getSearch() {
		return search;
	}
	@FindBy(xpath="//button[@type='submit']")
	private WebElement submit;

	public WebElement getSubmit() {
		return submit;
	}
	@FindBy(xpath="//div[text()='APPLE iPhone 11 (Black, 64 GB)']")
	private WebElement clickname;

	public WebElement getClickname() {
		return clickname;
	}
	@FindBy(xpath="//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")
	private WebElement addtocart;

	public WebElement getAddtocart() {
		return addtocart;
	}
	
		
	
}