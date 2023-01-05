package com.SauceDemo.POMPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPomClass
{
	//webelement find
		//action webelement
		
		//1.WebDriver declared
		private WebDriver driver;
		private Actions act;
		 
		 //2.Find WebElement-username 
		 //do not use findElement method
//		 WebElement username = driver.findElement(By.xpath("ABC"));
		 
		//annotation -> @ -> @FindBy -> its like a method only
		 
		 @FindBy(xpath="//input[@id='user-name']")
		 WebElement username;
		 
		 @FindBy(xpath="//input[@id='password']")
		 WebElement password;
		 
		 @FindBy(xpath="//input[@id='login-button']")
		 WebElement loginBtn;
		 
		 //3.Ele --> action perform
		 //maitain them in method
		 
		 public void sendUsername()
		 {
			 username.sendKeys("standard_user");
		 }
		 
		 public void sendPassword()
		 {
			 password.sendKeys("secret_sauce");
		 }
		 
		// public void clickLoginButton()
		// {
			// loginBtn.click();
		// }
		 //mouse action click method
		 public void clickLoginButton()
		 {
			 act.click(loginBtn).perform();
		 }
		 
		 //4.constructor declare
		 
		 public LoginPomClass(WebDriver driver)
		 {
			 this.driver= driver;
			 PageFactory.initElements(driver, this);
			 act = new Actions(driver);
		 
		 }
		 
		 
		//1.WebDriver declared
	    //2.Find WebElement
		//3.Ele --> action perform
		//4.constructor declare
		 

}
