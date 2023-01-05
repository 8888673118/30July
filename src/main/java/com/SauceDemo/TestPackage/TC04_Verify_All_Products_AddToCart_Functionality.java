package com.SauceDemo.TestPackage;


import org.testng.annotations.Test;

import com.SauceDemo.POMPackage.PomClassHomePage;

public class TC04_Verify_All_Products_AddToCart_Functionality extends TestBaseClass
{
	@Test
	public void Verify_All_Products_AddToCart_Functionality()
	{
		
		PomClassHomePage hp = new PomClassHomePage(driver);
		
		//allPrdtClick
		hp.clickAllProduct();
		System.out.println("Clicked on all Product");
		
		System.out.println("Apply the validation");
		
		String expectedProductSelection = "6";
		String actualProductSelected = hp.getTextFromAddToCartBtn();  //1
		
		//if(expectedProductSelection.equals(actualProductSelected))
		//{
			//System.out.println("All Product Test case is passed");
		//}
		//else
		//{
			//System.out.println("All Product Test case is failed");
		//}
		//Assert.assertEquals(actualProductSelected,expectedProductSelection );
		
		
		
	}




	}

