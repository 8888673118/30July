package com.SauceDemo.TestPackage;





import org.testng.Assert;
import org.testng.annotations.Test;

import com.SauceDemo.POMPackage.PomClassHomePage;


public class TC02_Verify_Log_out_Test_Class extends TestBaseClass 
{
	@Test
	public void Verify_Log_out_Test_Class() 
	{
		
		
		PomClassHomePage hp = new PomClassHomePage(driver);
		//settingBtn
		hp.clickSettingBtn();
		System.out.println("Clicked on Setting Btn");
		
		//logOutBtn
		hp.clickLogOutBtn();
		System.out.println("Clicked on LogOut btn");
		
		//loginPage
		System.out.println("went on login page");
		
		//Validation
		System.out.println("Apply the Validation");
						
		String givenTitle = "Swag Labs";   //PO/BA/dev		
		String actualTitle = driver.getTitle();
						
		//if(givenTitle.equals(actualTitle))
		//{
			System.out.println("LogOut Test is passed");
		//}
		//else
		//{
			//System.out.println("LogOut Test is failed");
		//}
			Assert.assertEquals(actualTitle, givenTitle);				
						
		
		
		
	}



	}

