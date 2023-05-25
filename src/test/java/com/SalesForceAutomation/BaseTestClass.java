package com.SalesForceAutomation;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTestClass {
static WebDriver driver =null;
	
	
	public static void enterText(WebElement element,String text,String name) {
    	//here we need parameter 1=WebElement eg.fathername,password,username and then I need text to enter (string) and then
    	//for validation (passed or failed we need tex
    	
    	if(element.isDisplayed()){
			
			element.clear();
			element.sendKeys(text);
		}else {
			System.out.println(name+" WebElement is not displayed || TestCase failed");
		}
    	
	}
    	 public static void closeBrowser() {
		 
    	   	driver.close();
    	   }
    	 
    	 
    	public static void getDriverInstance(String browserName) {
    		
    		switch(browserName) {
    		case "firefox": WebDriverManager.firefoxdriver().setup();
    		driver=new FirefoxDriver();
    		driver.manage().window().maximize();
            break;
    		
    		case "chrome":WebDriverManager.chromedriver().setup();
    		driver= new ChromeDriver();
    		driver.manage().window().maximize();
    		break;
    		
    		default:System.out.println("enter proper browser name");
    		
    		}	
    	}
    	
    	public static void implicitWait() {
    		
    		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	}
    	
    	public static void goToUrl(String url) {
    		driver.get(url);
    	}
    	
	    public static void click(WebElement element) {
		element.click();
	}
	    public static String getTextFromWebElement(WebElement element,String name ) {
		if(element.isDisplayed()) {
			return element .getText(); 
		}
		else {
			System.out.println(name+"web element is not displayed");
		
		return null;
	}
	}
		public static void  getTitle() {
			driver.getTitle();
			
		}
		public static void clickCheckBox() {
			clickCheckBox();
		}
		public static void userMenuDropdown(WebElement element) {
			element.click();
		}
		public static void usernameFieldVerification(WebElement element) {
			if(element.isDisplayed()) {
				System.out.println(element.getText());
				System.out.println("web Element is displayed || TestCase passed");
			}else {
				System.out.println("Web Element is not displayed || TestCase failed");
			}
		}
		public static void logOut(WebElement element) {
			element.click();
		}
		public static void forgetPassword(WebElement element) {
			element.click();
		}
		public static void senDKeys(WebElement element,String username) {
			element.sendKeys(username);
		}
    	
		
    	
		}
