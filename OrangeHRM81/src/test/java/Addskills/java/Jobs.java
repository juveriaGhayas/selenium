  package  Addskills.java;
//import MercuryDemoTours;


import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import HTMLReport.*;

public class Jobs
{
	
	
	//public  static 	String UserName, Password ;
	 WebDriver driver;

	 String HtmlOutputFileName;
	 String error;
	 Reporter1 R1;
	 ExtentTest logger;
	 ExtentReports extent;
	 String ExtentTestName;
	
    

  public void Jobs(WebDriver driver,Reporter1 R1 )throws Exception
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
	
	
	
	
	
	
		 
		 public   void AddJobs(String TestURL)throws Exception
		 {
			 //https://opensource-demo.orangehrmlive.com/
			 
			    try
			 	{
					
			    	driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Confirm Toggl Sync'])[1]/following::b[1]")).click();
			    	driver.findElement(By.id("menu_admin_Job")).click();
			    	driver.findElement(By.id("menu_admin_viewJobTitleList")).click();
			    	driver.findElement(By.id("btnAdd")).click();

			    	driver.findElement(By.id("jobTitle_jobTitle")).sendKeys("manual");

			    	driver.findElement(By.id("jobTitle_jobDescription")).sendKeys("testing");

			    	driver.findElement(By.id("jobTitle_note")).sendKeys("hi");
			    	driver.findElement(By.id("btnSave")).click();
						
						 R1.TakeScreenShotAuto(driver,"Open Url - Orange HRM Url Invoked Successfully ","Pass");

						 
			 	}
			 	catch(Exception e)
				{
			 		 R1.TakeScreenShotAuto(driver," unable to  - Orange HRM page ","Fail");
				}
			 

		 }
		 
		 


		 
}
	


	
	