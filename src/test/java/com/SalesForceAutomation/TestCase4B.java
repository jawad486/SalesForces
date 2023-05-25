package com.SalesForceAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TestCase4B extends BaseTestClass {

	public static void main(String[] args) {
		ForgetpasswordTestCase4B();
	}
		public static void ForgetpasswordTestCase4B() {
	           getDriverInstance("chrome");
		       implicitWait();
		       goToUrl("https://login.salesforce.com/");
	         	//username
				WebElement usernameField=driver.findElement(By.id("username"));
				enterText(usernameField,"123" , "username");
				
				//password
				WebElement passwordField=driver.findElement(By.id("password"));
				enterText(passwordField," 22131 ","password1");
				
				//clicking on login button
				WebElement loginButton=driver.findElement(By.id("Login"));
				click(loginButton);
				//verifying login error message
				WebElement error1=driver.findElement(By.id("error"));
				String expected="Please check your username and password. If you still can't log in, contact your Salesforce administrator.";
		        String actual=getTextFromWebElement(error1,"Please check your username and password. If you still can't log in, contact your Salesforce administrator.");
		    
		    	 if(actual.equalsIgnoreCase(expected)) {
		    		 System.out.println("Please check your username and password. If you still can't log in, contact your Salesforce administrator. || TestCase passed");
		    	 }
		    	    closeBrowser();
	}

}
