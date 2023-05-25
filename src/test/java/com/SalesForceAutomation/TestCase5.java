package com.SalesForceAutomation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TestCase5 extends BaseTestClass {

	public static void main(String[] args) {
		selectUserMenuTC5();

	}
	public static void selectUserMenuTC5() {
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
		        //clicking on dropdown menu
				WebElement dropdown =driver.findElement(By.xpath("//*[@id=\"userNavLabel\"]"));
				dropdown.click();
				// Find all the options within the dropdown list
		        List<WebElement> options = driver.findElements(By.xpath("//*[@id=\"userNavMenu\"]"));

		        // Iterate over the options and retrieve their text values
		        for (WebElement option : options) {
		            System.out.println(option.getText());
		        }
		        // Check if the dropdown menu is displayed or not
		        boolean isDisplayed = dropdown.isDisplayed();

		        if (isDisplayed) {
		            System.out.println("Dropdown menu is displayed || Test case passed ");
		        } else {
		            System.out.println("Dropdown menu is not displayed || Test case failed");
		        }
                 driver.close();
	}
}
