package vicroads.rego;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class RegoSixMonths {
	
	
public static void main(String[] args) throws MalformedURLException, InterruptedException {
		
		WebDriver driver;
		
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("platformName","Android");
		caps.setCapability("browserName","chrome");
		caps.setCapability("version","10");
		caps.setCapability("deviceName","277874691a017ece");
		
		driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps );

		
		driver.get("https://www.vicroads.vic.gov.au/");
			System.out.println("URL launch successfully");
		driver.findElement(By.xpath("//*[@id='ph_pagebody_0_phheader_0_lnkNavMobile']")).click();
		//registration
		driver.findElement(By.partialLinkText("Registration")).click();
		//registration fees
		driver.findElement(By.partialLinkText("Registration fee")).click();
		//short term fees
		driver.findElement(By.partialLinkText("Short-term")).click();
		//clicking on fee calculator
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("Fee Calculator")).click();
		//clicking lets get started
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id='aside']/div/div/div[2]/div[14]/button[2]")).click();
		//enter valid postcode
		driver.findElement(By.xpath("//*[@id='txtPostCode']")).sendKeys("3011");		
		//click next button
		driver.findElement(By.xpath("//*[@id='aside']/div/div/div[2]/div[14]/button[3]")).click();
		Thread.sleep(4000);
		//select vehicle type
		//String labelText;   
		//labelText = driver.findElement(By.xpath("//*[@id='aside]/div/div/div[2]/div[3]/div/span")).getText();
		//System.out.println(labelText);
		//click the radio button
		driver.findElement(By.xpath("//*[@id='rbVehicleTypeCar']")).click();
		Thread.sleep(4000);
			
		//click next for vehicle selection 
		
		driver.findElement(By.xpath("//*[@id=\"aside\"]/div/div/div[2]/div[14]/button[3]")).click();
		
		Thread.sleep(2000);
		//what type of fule radio button
		driver.findElement(By.xpath("//*[@id='rbFuelTypePetrolDieselLpg']")).click();
		driver.findElement(By.xpath("//*[@id='aside']/div/div/div[2]/div[14]/button[3]")).click();
		//got concession card
		driver.findElement(By.xpath("//*[@id='aside']/div/div/div[2]/div[10]/div[1]/ul/li[2]/label")).click();
		driver.findElement(By.xpath("//*[@id='aside']/div/div/div[2]/div[14]/span/button")).click();
		
		// printing total price for 3 months
		
				//String ThreeMonths;   
				//ThreeMonths = driver.findElement(By.xpath("//*[@id='aside]/div/div/div[2]/div[3]/div/span")).getText();
				//System.out.println(labelText);
		
		Thread.sleep(10000);
		//driver.quit();
		System.out.println("closed driver successfully");
		
		
		
		System.out.println("satish first java program");
		
		
		
		
	}

}


