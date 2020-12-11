/**
 * 
 */
package com.appium;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

/**
 * @author satis
 *
 */
public class Login {
	
	
	
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		
		WebDriver driver;
		
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("platformName","Android");
		caps.setCapability("browserName","chrome");
		caps.setCapability("version","10");
		caps.setCapability("deviceName","277874691a017ece");
		
		driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps );
		
//		System.out.println("Driver initilization succdess");
//		
//		driver.get("http://www.google.com");
//		
//		System.out.println("url launch");
//		
//		Thread.sleep(10000);
//		
//		System.out.println("finding elements and sending keys");
//		
//		driver.findElement(By.name("q")).sendKeys("this mobile automation demo");
//		Thread.sleep(2000);
		
		driver.get("https://www.goldmansachs.com");
			System.out.println("URL launch successfully");
		driver.findElement(By.xpath("//*[@id='nav-legal-link-container']/button")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.id("global-search")).sendKeys("LOGIN");
		
		Thread.sleep(10000);
		driver.quit();
		System.out.println("closed driver successfully");
		
		
		
		System.out.println("satish first java program");
		
		
		
		
	}

}
