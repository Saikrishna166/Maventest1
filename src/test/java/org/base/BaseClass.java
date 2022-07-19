package org.base;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;


public class BaseClass {

	public static WebDriver driver;
	
	public static WebDriver ChromeBrowser() {
		WebDriverManager.chromedriver().setup();
		return driver=new ChromeDriver();
		}
	public static WebDriver browserLaunch(String bname) {
		if(bname.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		return driver;
	}
	
	
	public static WebDriver browserLaunch2(String bname) {
		switch(bname) {
		case"chrome":
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		case"edge":
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}
		return driver;
		
	}
	public static void urlLaunch(String url) {
		driver.get(url);
		driver.manage().window().maximize();
		}
	public static void implicitlywait(int a) {
		driver.manage().timeouts().implicitlyWait(a, TimeUnit.SECONDS);
		}
	public static void sendkeys(WebElement e, String value) {
		e.sendKeys(value);
		}
	public static void click(WebElement e) {
		e.click();
		}
	public static String getCurrentUrl() {
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;
		}
	
	public static void quit() {
		driver.quit();
		}
	public static String getTitle() {
		String title = driver.getTitle();
		return title;
		}
	public static String getText(WebElement e) {
		String text = e.getText();
		return text;
		}
	public static String getAttribute(WebElement e) {
		String attribute = e.getAttribute("value");
		return attribute;
		}
	public static Dimension getSize(WebElement s, int q) {
		Dimension size = s.getSize();
		return size;
		}
	public static void Closed() {
		driver.close();
		}
	public static void moveToElement(WebElement e) {
		Actions a=new Actions(driver);
		a.moveToElement(e).perform();
		}
	public static void dragAndDrop(WebElement src,WebElement tar) {
		Actions a=new Actions(driver);
		a.dragAndDrop(src, tar).perform();
		}
	public static void selectByIndex(WebElement e, int a) {
		Select s=new Select(e);
		s.selectByIndex(a);
		}
	public static void selectByValue(WebElement a, String t) {
		Select s=new Select(a);
		s.selectByValue(t);
		}
	public static void selectByVisible(WebElement a, String h) {
		Select s=new Select(a);
		s.selectByVisibleText(h);
		}
	public static void DeselectByAll(WebElement w) {
		Select s=new Select(w);
		s.deselectAll();
	    }
	public static void DeselectByIndex(WebElement w, int h) {
		Select s=new Select(w);
		s.deselectByIndex(h);
		}
	public static void DeselectByValue(WebElement w, String h) {
		Select s=new Select(w);
		s.selectByValue(h);
		}
	public static void DeselectByVisible(WebElement w, String h) {
		Select s=new Select(w);
		s.deselectByVisibleText(h);
		}
	public static void Contestclick(WebElement w) {
		Actions a=new Actions(driver);
		a.contextClick(w).perform();
		}
	public static  void DoubleClick(WebElement q) {
		Actions a=new Actions(driver);
		a.doubleClick(q).perform();
		}
	public static void ActionClick() {
		Actions a=new Actions(driver);
		a.click().perform();
		}
	public static void keyPress(int a) throws Exception {
		Robot r=new Robot();
		r.keyPress(a);
		}
	public static void KeyRelease(int b) throws AWTException {
		Robot r=new Robot();
		r.keyRelease(b);
		}
	public static List<WebElement> getoptions(WebElement a) {
		Select s=new Select(a);
		List<WebElement> options = s.getOptions();
		return options;
		}
	public static  WebElement getFirstSelectedOptions(WebElement x) {
				Select s=new Select(x);
				WebElement firstSelectedOption = s.getFirstSelectedOption();
				return firstSelectedOption;
				}
	public static String WindowsHandle(String w) {
		String windowHandle = driver.getWindowHandle();
		return windowHandle;
		}
	public static Set<String> getWindowsHandles(WebElement e) {
		Set<String> windowHandles = driver.getWindowHandles();
		return windowHandles;
		
		}
	public static void navigate(String q) {
		driver.navigate().to(q);
		}
	public static void navigateback() {
		driver.navigate().back();
	}
	public static void navigateforward() {
		driver.navigate().forward();
		}
	public static void navigaterefresh() {
		driver.navigate().refresh();
		}
	public static void accept() {
		org.openqa.selenium.Alert al = driver.switchTo().alert();
		al.accept();
		}
	public static void dismiss() {
		Alert alert = driver.switchTo().alert();
		alert.dismiss();
		}
	public static void alertSendkey(String value) {
	Alert alert = driver.switchTo().alert();
	alert.sendKeys(value);
	}
	public static String getText() {
		Alert alert = driver.switchTo().alert();
		String text = alert.getText();
		return text;
		}
	public static void Takescreenshot(String Id) throws IOException {
		TakesScreenshot tk=(TakesScreenshot)driver;
		File srcFile = tk.getScreenshotAs(OutputType.FILE);
		File destFile=new File(Id);
		FileUtils.copyFile(srcFile, destFile);
		}
	public static void String(String Id) {
		driver.switchTo().frame(Id);
		}
	public static void index(int a) {
		driver.switchTo().frame(a);
		}
	public static void executescript(String q, String u) {
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript(q, u);
		}
	public static void Executescript() {
		JavascriptExecutor js=(JavascriptExecutor) driver;
		}
	public static void refresh() {
		driver.navigate().refresh();
		}
	
	public static void swicToWindow(int q) {
		Set<String> allId = driver.getWindowHandles();
		List<String> li=new LinkedList<>();
		li.addAll(allId);
		
		driver.switchTo().window(li.get(q));
		}
	
	
		
	
	
	
		
	
	
	
	
	
	
	
	
	
	
}
