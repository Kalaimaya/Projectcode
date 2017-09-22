package com.bidqa.testcases;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

import com.bidqa.pages.LoginPage;

public class VerifyBidQaLogin {
	
	private static WebDriver driver;	
	
	public static void log(String str)
	{
		System.out.println(str);
	}
	//test is demonstrate the entry of test cases
	
	public static void main (String args[]) {
		VerifyBidQaLogin vl = new VerifyBidQaLogin();
		vl.testLogin();
	}
	
	public VerifyBidQaLogin()
	{
		File pathToBinary = new File("C:\\Kalai\\Firefox\\firefox.exe");
		FirefoxBinary ffBinary = new FirefoxBinary(pathToBinary);
		FirefoxProfile firefoxProfile = new FirefoxProfile();       
		driver = new FirefoxDriver(ffBinary,firefoxProfile);
	}
	
	public void testLogin()
	{
    	driver.manage().window().maximize();
    	driver.get("http://test.bidqa.com/");
    	//call the constructor
		LoginPage login=new LoginPage(driver);
		login.clickonlogin();
		login.typeusername();
		login.typepassword();
		login.clickonsignin();
		login.clickonlogout();
		System.out.println("Successfully logout");
		//driver.quit();
		//run as testng why? we used annotation here @Test.
	}
	
}

