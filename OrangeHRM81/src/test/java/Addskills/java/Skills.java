package  Addskills.java;
//import MercuryDemoTours;


import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import HTMLReport.Reporter1;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;



public class Skills
{
	
	
	//public  static 	String UserName, Password ;
	 WebDriver driver;
	
	
	 
	 Reporter1 R1;

	
	public void  Nationality(WebDriver driver,Reporter1 R1 )throws Exception
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
	
	
	
	
	
	



public   void NationalityDetails(String skills )throws Exception
{  
	

	try 
	{

		findElement(By.id("Admin")).click();
		findElement(By.id("menu_admin_Qualifications")).click();

		findElement(By.id("menu_admin_viewSkiboolls")).click();
		
		// boolean f =findElement(By.xpath("//*[@id=\"recordsListDiv\"]/div[1]/h1")).isDisplayed();
		
		findElement(By.id("btnAdd")).click();
		findElement(By.id("btnAdd")).click();
		findElement(By.id("skill_name")).sendKeys("Dot Net");

		findElement(By.id("skill_description")).sendKeys("need to add the description data");
		findElement(By.id("btnSave")).click();	
		 	
		 
	 R1.TakeScreenShotAuto(driver,"Skills Page - Skills Entered","Pass");
	 
	
	 findElement(By.id("btnSave")).click();
	
	 
	 

	 
	 	
	
	} 
	catch(Exception e)
	{
		
	}
	 
	
 
}
	
	
		 


		 
}
	


	
	