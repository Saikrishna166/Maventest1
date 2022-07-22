package org.AmazonPage;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class AmazonPage extends BaseClass {
	
	public AmazonPage() {
		PageFactory.initElements(driver, this);
		}
	@FindBy(id="twotabsearchtextbox")
	private WebElement search;
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement btnSearch;
	
	@FindBys({@FindBy(xpath="(//span[@class='a-size-medium a-color-base a-text-normal'])[1]"),@FindBy(xpath="(//span[@class='a-size-medium a-color-base a-text-normal'])[18]")})
	private WebElement iphone1;
	

	public WebElement getSearch() {
		return search;
	}

	public WebElement getBtnSearch() {
		return btnSearch;
	}

	public WebElement getIphone1() {
		return iphone1;
	}
	
		
		
	
	

}
