package org.test;

import java.awt.event.KeyEvent;

import org.base.BaseClass;
import org.openqa.selenium.interactions.Actions;
import org.youtube.YoutubePage;

public class Youtube extends BaseClass{
	
	public static void main(String[] args) throws Exception {
		
		browserLaunch2("edge");
		urlLaunch("https://www.youtube.com/");
		YoutubePage yt=new YoutubePage();
		sendkeys(yt.getSearch(),"Irfan'sview");
		click(yt.getBtnSearch());
		Thread.sleep(3000);
		Contestclick(yt.getRightClick());
		keyPress(KeyEvent.VK_DOWN);
		KeyRelease(KeyEvent.VK_DOWN);
		keyPress(KeyEvent.VK_DOWN);
		KeyRelease(KeyEvent.VK_DOWN);
		keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		click(yt.getShare());
		
		
		
		
	}

}
