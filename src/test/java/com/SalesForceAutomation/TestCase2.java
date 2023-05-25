package com.SalesForceAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TestCase2 extends BaseTestClass{
	public static void main(String[] args) {
		
		 LoginToSalesForceTestcase2(); 

	}
		public static void LoginToSalesForceTestcase2() {
			
			  //init driver
					getDriverInstance("chrome");
					
					//wait
					implicitWait();
					
					//url
				    goToUrl("https://login.salesforce.com/");
					
					//username
					WebElement usernameField=driver.findElement(By.id("username"));
					enterText(usernameField,"jawadqureshi718@gmail.com" , "username");
					
					//password
					WebElement passwordField=driver.findElement(By.id("password"));
					enterText(passwordField," Admin123 ","password1");
					
					//clicking on login button
					WebElement loginButton=driver.findElement(By.id("Login"));
					click(loginButton);
					
					//verifing the title of the page
					String title1=driver.getTitle();
					String excepted="Home Page ~ Salesforce - Developer Edition";
					String  acutal =driver.getTitle();
					if(acutal.equalsIgnoreCase(excepted)) {
						System.out.println("user is in home page of sales forces application || Test case passed ");
						
					}
					
					closeBrowser();
	}

}
