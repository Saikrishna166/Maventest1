package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Greentest {
	public static void main(String[] args) {
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.greenstechnologys.com/");
		JavascriptExecutor js=(JavascriptExecutor)driver;
	
		
		WebElement Green = driver.findElement(By.xpath("(//div[@class='trainer-info'])[5]"));
	    js.executeScript("argument[0].scrollIntoView(true)", Green);
	    String text = Green.getText();
	    System.out.println(text);
	    WebElement Gt = driver.findElement(By.xpath("(//span[@class='red_text'])[5]"));
	    String text2 = Gt.getText();
	    System.out.println(text2);
	}

}
