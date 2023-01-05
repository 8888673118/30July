package com.SauceDemo.TestPackage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TC01_TestClass_Verify_Login_Functionality extends TestBaseClass 
{
	@Test
	public void TestClass_Verify_Login_Functionality()
	{
		

						
				//Validation
				System.out.println("Apply the Validation");
						
				String givenTitle = "Swag Labs";   //PO/BA/dev		
				String actualTitle = driver.getTitle();
						
				//if(givenTitle.equals(actualTitle))
				//{
					System.out.println("Login Test is passed");
				//}
				//else
				//{
					System.out.println("Login Test is failed");
				//}
						
					Assert.assertEquals(actualTitle, givenTitle);		
				
			}
			
}
		



