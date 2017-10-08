/**
 * 
 */
package com.bidqa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author kalai
 *This class will store all locators and methods of login page....
 
 */
public class LoginPage {
	
	//local variable perform activity//
	WebDriver driver;
	
	
	static {
		System.out.println("Hello from loginpage");
	}
	
	By userlogin=By.className("login-awsome");
	By username=By.xpath(".//*[@id='log']");
	By password=By.xpath(".//*[@id='login_password']");
	By login=By.xpath(".//*[@id='submits']");
	By logout=By.className("logout-awsome");
	
	//Constructor name and Arguments
	public LoginPage(WebDriver driver)
	{
		//calling this driver
		//initialize the WebDriver
		this.driver=driver;
	}
	public void clickonlogin()
	{
		driver.findElement(userlogin).click();
	}
	public void typeusername()
	{
		driver.findElement(username).sendKeys("kalai20");
	}
	public void typepassword()
	{
		driver.findElement(password).sendKeys("Kalai123");
	}
	public void clickonsignin()
	{
		driver.findElement(login).click();
	}
	public void clickonlogout()
	{
		driver.findElement(logout).click();
	}	
 
}
