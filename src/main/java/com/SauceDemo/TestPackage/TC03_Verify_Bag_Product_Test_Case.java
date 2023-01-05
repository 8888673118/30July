package com.SauceDemo.TestPackage;



//import java.time.Duration;

//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.SauceDemo.POMPackage.PomClassHomePage;

//import automationProject.LoginPomClass;


public class TC03_Verify_Bag_Product_Test_Case extends TestBaseClass
{
	@Test
	public void Verify_Bag_Product_Test_Case1()
	{
		
	PomClassHomePage hp = new PomClassHomePage(driver);
		
		//bagPrdtClick
		hp.clickBagProduct();
		System.out.println("Clicked on bagProduct");
		
		System.out.println("Apply the validation");
		String expectedProductSelection = "1";
		String actualProductSelected = hp.getTextFromAddToCartBtn();  //1
		
		//if(expectedProductSelection.equals(actualProductSelected))
		//{
			//System.out.println("Bag Product Test case is passed");
		//}
		//else
		//{
			//System.out.println("Bag Product Test case is failed");
		//}
		Assert.assertEquals(actualProductSelected,expectedProductSelection );
		
		
		}




	}


