package com.bidqa.testcases;
import java.io.File;
import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxBinary;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebDriver;
public class VerifyRegistraion {
	//File pathToBinary = new File("C:\\Kalai\\Firefox\\firefox.exe");
	//FirefoxBinary ffBinary = new FirefoxBinary(pathToBinary);
//	FirefoxProfile firefoxProfile = new FirefoxProfile()      
//	driver = new FirefoxDriver(ffBinary,firefoxProfile);
	// private static final String TestConstants = null;;;;;
		private WebDriver driver;
			public static void main(String[] args) {
				// TODO Auto-generated method stub::::::::::
			}
			 @Before
			    public void setUp() throws Exception {
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\kalai\\Downloads\\chromedriver_win32\\chromedriver.exe");
				  driver = new ChromeDriver();
				  
				driver.manage().window().maximize();
			 }
			 
			 @Test
			 public void test() throws InterruptedException{
				 //open URL
				 driver.get("http://liveinews.com");
			        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				 //String expTitle="BidQa";
				 driver.findElement(By.xpath(".//*[@id='menu-item-1716']/a")).click(); 
				 Select drpuser = new Select(driver.findElement(By.id("i-e-type")));
					drpuser.selectByVisibleText("User");
					drpuser.selectByIndex(0);
				 driver.findElement(By.id("reg_email")).sendKeys("kalaivani_90@yahoo.com");
					// sleep for about one second
				 Thread.sleep(1000);
				 driver.findElement(By.id("reg_password")).sendKeys("Kalai123");
				// sleep for about one second
				 Thread.sleep(1000);
		         driver.findElement(By.id("creg_password")).sendKeys("Kalai123");
		         //sleep for one second
				 Thread.sleep(1000);
		         driver.findElement(By.xpath(".//*[@id='i-e-name']")).sendKeys("KalaiM12");
				 Thread.sleep(1000);
		         driver.findElement(By.xpath(".//*[@id='registration-form']/p[2]/input")).click();
				 Thread.sleep(1000);
		         driver.findElement(By.xpath(".//*[@id='acceptterms']")).click();
				 Thread.sleep(1000);
		         driver.findElement(By.xpath(".//*[@id='terms-modal']/div/p[2]/span")).click();
				 Thread.sleep(1000);
		         driver.findElement(By.xpath(".//*[@id='registration-form']/p[2]/input")).click();
		         System.out.println("Successfully Registered");
			 }
}
