package com.SalesForceAutomation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class TestCase6 extends BaseTestClass {

	public static void main(String[] args) throws Exception  {
		selectMyProfileOptionTC6();

	}
	public static void selectMyProfileOptionTC6() throws InterruptedException  {
        //init driver
		getDriverInstance("chrome");
		
		
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
       // clicking on my profile button
          WebElement myProfilebutton= driver.findElement(By.xpath("//*[@id=\"userNav-menuItems\"]/a[1]"));
    		 click(myProfilebutton);
       //click on edit button
    		 try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    		WebElement editButton= driver.findElement(By.xpath("/html/body/div[1]/div[2]/table/tbody/tr/td/div/div[2]/div[2]/div[1]/h3/div/div/a/img"));
    		click(editButton);
    		
    		//validating edit profile page 
    		WebElement editProfilePage=driver.findElement(By.id("contactInfoTitle"));
    	    boolean isDisplayed1=editProfilePage.isDisplayed();
    	    if(isDisplayed1) {
    		System.out.println("edit profile page is displayed || TestCase passed");
    	    }          
            else{
            System.out.println("edit profile page is not  displayed || TestCase failed");
}
    	    //switching to frame in edit profile page
    	    driver.switchTo().frame("contactInfoContentId");

			/*
			 * // clicking on about button try { Thread.sleep(2000); } catch
			 * (InterruptedException e) { // TODO Auto-generated catch block
			 * e.printStackTrace(); }
			 */
    	    WebElement aboutButton =driver.findElement(By.partialLinkText("About"));
    	    click(aboutButton);
    	    
    	    //edit the last name field
    	    WebElement editLastName=driver.findElement(By.id("lastName"));
    	    enterText(editLastName, "ahmad", "lastNam");
    	   
    	    //clicking on save all button
    	  WebElement saveAllButton=  driver.findElement(By.xpath("//*[@id=\"TabPanel\"]/div/div[2]/form/div/input[1]"));
    	  click(saveAllButton);
    	  
    	  //switching out from iframe
    	  driver.switchTo().defaultContent();
    	  
    	  //clicking on post link
    	 WebElement postLinkButton= driver.findElement(By.className("publisherattachtext"));
    	 click(postLinkButton);
    	 
    	 //switching to frame
    	driver.switchTo().frame(0);
       
    	
    	
    	try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
   WebElement text=driver.findElement(By.xpath("//*[@dir='ltr']"));//hidden
   JavascriptExecutor js = (JavascriptExecutor)driver;
   js.executeScript("arguments[0].setAttribute('style','overflow-y:visible;');",text);
   Thread.sleep(2000);

   WebElement textClick=driver.findElement(By.xpath("//*[@contenteditable='true']"));
   js.executeScript("arguments[0].click();", textClick);
   Thread.sleep(2000);
   textClick.sendKeys("This is new update for @Jawad");
    	
    	//switching back from frame
    	
    	driver.switchTo().defaultContent();
    	WebElement sharebutton= driver.findElement(By.id("publishersharebutton"));
    	click(sharebutton);
		   Thread.sleep(2000);
        WebElement  postlinkText=driver.findElement(By.xpath("//div[@id='0D58d00001knqx7']//p[contains(text(),'This is new update for @Jawad')]"));
          boolean isDisplayed11=postlinkText.isDisplayed();
          if(isDisplayed11) {
        	  System.out.println("Text is displayed || Test case passsed");
          }else {
        	  System.out.println("Text is not Displayed || Test case failed");
          }
          Thread.sleep(2000);
 //clicking on file 
    WebElement fileButton=driver.findElement(By.linkText("File"));
    click(fileButton);
    
   WebElement uploadButton= driver.findElement(By.linkText("Upload a file from your computer"));
   click(uploadButton);
   WebElement chooseFile=driver.findElement(By.xpath("//*[@id=\"chatterFile\"]"));
 chooseFile.sendKeys("C:\\Users\\jawad\\Desktop\\empty.odt");
 
 //clicking on share button to upload file
WebElement sharefileButton= driver.findElement(By.id("publishersharebutton"));
click(sharefileButton);
  WebElement checkUploadFile= driver.findElement(By.className("contentTitleLink"));
  boolean uploadFile=checkUploadFile.isDisplayed();
  if(uploadFile) {
	  System.out.println("Uploaded file is displayed || Testcase passed");
  }else {
	  System.out.println("Uploaded file is not displayed || Testcase failed");

  }
  //clicking on addPhoto link
      WebElement photoUpload= driver.findElement(By.id("displayBadge"));
      click(photoUpload);
     
    driver.switchTo().frame("uploadPhotoContentId");
    WebElement photo= driver.findElement(By.xpath("//input[@id='j_id0:uploadFileForm:uploadInputFile']"));
     photo.sendKeys("C:\\Users\\jawad\\Desktop\\tiger.jpg");
	}
}
