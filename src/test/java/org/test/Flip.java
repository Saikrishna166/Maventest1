package org.test;

import org.FlipKart.FlipKartPage;
import org.base.BaseClass;

public class Flip extends BaseClass {
	
	public static void main(String[] args) throws InterruptedException {
		
		browserLaunch2("edge");
		urlLaunch("https://www.flipkart.com/");
		FlipKartPage fk=new FlipKartPage();
		click(fk.getClosed());
		sendkeys(fk.getSearch(),"iphone");
		click(fk.getSubmit());
		Thread.sleep(3000);
		click(fk.getClickname());
		swicToWindow(1);
		Thread.sleep(3000);
		click(fk.getAddtocart());
		
		
		
	}

}
