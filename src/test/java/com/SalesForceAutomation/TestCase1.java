package com.SalesForceAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TestCase1 extends BaseTestClass{

	public static void main(String[] args) throws Exception {
		loginErrorMessageTestCase1();
		
		
	}
		public static void loginErrorMessageTestCase1() throws InterruptedException {
		    //init driver
			getDriverInstance("chrome");
			
			//wait
			implicitWait();
			
			//url
		    goToUrl("https://login.salesforce.com/");
			
			//username
			WebElement usernameField=driver.findElement(By.id("username"));
			enterText(usernameField,"User@gmail.com" , "username");
			
			//password
			WebElement passwordField=driver.findElement(By.id("password"));
			enterText(passwordField,"  ","password1");
			
			//clicking on login button
			WebElement loginButton=driver.findElement(By.id("Login"));
			click(loginButton);
			
			
			
			//verifying login error message
			WebElement error1=driver.findElement(By.id("error"));
			String expected="Please enter your password.";
	        String actual=getTextFromWebElement(error1,"Please enter your password.");
	    
	    	 if(actual.equalsIgnoreCase(expected)) {
	    		 System.out.println("Login error message displayed || TestCase passed");
	    	 }
	    	closeBrowser();
	    	 

	}

}
