package com.SalesForceAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TestCase3 extends BaseTestClass{

	public static void main(String[] args) {
		
		rememberMeCheckBoxLoginPageTestCase3();
		
	}
	public static void rememberMeCheckBoxLoginPageTestCase3() {
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
			
			//click on checkbox
			WebElement checkbox=driver.findElement(By.id("rememberUn"));
			click(checkbox);
			
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
			
			//clicking on dropdown menu
			WebElement dropdown=driver.findElement(By.id("userNavButton"));
			userMenuDropdown(dropdown);
			
			//logging out 
			WebElement logout=driver.findElement(By.xpath("//*[@id=\"userNav-menuItems\"]/a[5]"));
			logOut(logout);
			
			//verifing the username field 
			WebElement usernameFieldVer=driver.findElement(By.id("idcard-identity"));
			usernameFieldVerification(usernameFieldVer);
		
		    closeBrowser();

	}

}
