package  Addskills.java;
//import MercuryDemoTours;


import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import HTMLReport.*;

public class Login
{
	
	String username_sendkey="//input[@id='txtUsername']";
	String password_sendkey="//input[@id='txtPassword']";
	
	String uid="txtUsername";
	
	//public  static 	String UserName, Password ;
	 WebDriver driver;


	 Reporter1 R1;

	
    

  public void Login(WebDriver driver,Reporter1 R1 )throws Exception
	{  
		this.driver=driver;
		
		this.R1=R1;
		
	}
	
	
	
	// Draws a red border around the found element. Does not set it back anyhow.
	public  WebElement findElement(By by) throws Exception {
		
	    WebElement elem = driver.findElement(by);
	    	    
	    // draw a border around the found element
	    if (driver instanceof JavascriptExecutor) {
	        ((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid red'", elem);
	        
	  //  TH3.HTMLScreenShot("Screen Shot","Click Here","Pass", HtmlOutputFileName,driver);
	        
	    }
	    return elem;
	}
	
	
	
	
	
	
		 
		 public   void openOrangeHRM(String TestURL)throws Exception
		 {
			 //https://opensource-demo.orangehrmlive.com/
			 
			 
			 
			    try
			 	{
					
						 driver.get(TestURL);
						
						 R1.TakeScreenShotAuto(driver,"Open Url - Orange HRM Url Invoked Successfully ","Pass");

						 
			 	}
			 	catch(Exception e)
				{
			 		 R1.TakeScreenShotAuto(driver," unable to  - Orange HRM page ","Fail");
				}
			 

		 }
		 
		 
		 
		 public   void OrangeHRMlogin(String UserName,String Password)throws Exception
		 {
			 
			 	try
			 	{
					
		
							 findElement(By.id(uid)).sendKeys(UserName); 
							 R1.TakeScreenShotAuto(driver,"Login Page - Enter user Name","Pass");
							 
				
							findElement(By.xpath(password_sendkey)).sendKeys(Password);
							R1.TakeScreenShotAuto(driver,"Login Page - Enter Password","Pass");
							
						  
		 		}
			 	catch(Exception e)
				{
					System.out.println("Error Message :"+e.getMessage());
					 R1.TakeScreenShotAuto(driver,e.getMessage(),"Fail");
				}
		 }
		 
		 
		 public  void OrangeHRMSigninClick()throws Exception
		 {
			 
			 
			  	String login_click="//input[@id='btnLogin']";
			 	findElement(By.xpath(login_click));
			 	R1.TakeScreenShotAuto(driver,"Login Page - Click on Sign In","Pass");
			 	findElement(By.xpath(login_click)).click();
			 	
			
		 }





		 
}
	


	
	