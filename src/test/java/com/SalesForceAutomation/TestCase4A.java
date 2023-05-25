package com.SalesForceAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TestCase4A extends BaseTestClass{

	public static void main(String[] args) {
		 forgetPassworA1TestCase4();
		
	}
		   public static void forgetPassworA1TestCase4() {
		    	getDriverInstance("chrome");
		    	implicitWait();
		    	goToUrl("https://login.salesforce.com/");
		    	
		    	//clicking on forget password feild
		    	WebElement fogetbutton=driver.findElement(By.id("forgot_password_link"));
		    	forgetPassword(fogetbutton);
		    	
		    	//send useremail id to useremail box
		    	WebElement usernameforgetfield=driver.findElement(By.id("un"));
		    	senDKeys(usernameforgetfield, "jawadqureshi718@gamil.com");
			
			    //clicking on continue button
		    	WebElement continueButton =driver.findElement(By.id("continue"));
		    	click(continueButton);
		    	
		        //check email fro resent password
		    	WebElement checkYourEmail = driver.findElement(By.id("header"));
		    	String excepted = "Check Your Email";
		    	String acutal=getTextFromWebElement(checkYourEmail,"\"Check Your Email\"");
		    	
		    	if(acutal.equalsIgnoreCase(excepted)) {
		   		 System.out.println("Check your Email message is  displayed || TestCase passed");
		   	 }
		    	closeBrowser();
	}

}
