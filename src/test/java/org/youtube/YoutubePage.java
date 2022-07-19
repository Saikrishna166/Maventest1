package org.youtube;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.FindBys;


public class YoutubePage extends BaseClass {
	
	public YoutubePage() {
		PageFactory.initElements(driver, this);
		}
	
	@FindBys({@FindBy(id="search"),@FindBy(xpath="//input[@type='text']")})
	private WebElement search;
	
	@FindAll({@FindBy(name="Search"),@FindBy(xpath="(//button[@class='style-scope ytd-searchbox'])[2]")})
	private WebElement btnSearch;
	
	@FindBy(xpath="(//a[@href='/watch?v=ii9wXEI6A6o'])[2]")
	private WebElement clickvideo;
	
	@FindBy(xpath="(//a[@href='/watch?v=ii9wXEI6A6o'])[2]")
	private WebElement RightClick;
	
	@FindBy(xpath="(//a[@class='yt-simple-endpoint style-scope ytd-button-renderer'])[12]")
	private WebElement Share;
	


	public WebElement getShare() {
		return Share;
	}


	public WebElement getRightClick() {
		return RightClick;
	}


	public WebElement getClickvideo() {
		return clickvideo;
	}


	public WebElement getSearch() {
		return search;
	}

	public WebElement getBtnSearch() {
		return btnSearch;
	}

			
}
