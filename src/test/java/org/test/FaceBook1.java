package org.test;

import org.base.BaseClass;
import org.login.LoginPage1;

public class FaceBook1 extends BaseClass {
	
	public static void main(String[] args) {
		
		browserLaunch2("edge");
		urlLaunch("https://www.facebook.com/");
		LoginPage1 l=new LoginPage1();
		sendkeys(l.getTxtuser(),"saikrishna");
		sendkeys(l.getTxtpass(),"1213456");
		refresh();
		sendkeys(l.getTxtuser(),"krish");
		
	}

}
