package vicroads.rego;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class RegoTwelveMonths {

public static void main(String[] args) throws MalformedURLException, InterruptedException {

				WebDriver driver;

				DesiredCapabilities caps = new DesiredCapabilities();
				caps.setCapability("platformName", "Android");
				caps.setCapability("browserName", "chrome");
				caps.setCapability("version", "10");
				caps.setCapability("deviceName", "277874691a017ece");

				driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);

				driver.get("https://www.vicroads.vic.gov.au/");
				System.out.println("URL launch successfully");
				driver.findElement(By.xpath("//*[@id='ph_pagebody_0_phheader_0_lnkNavMobile']")).click();
				// registration
				driver.findElement(By.partialLinkText("Registration")).click();
				// registration fees
				driver.findElement(By.partialLinkText("Registration fee")).click();
				// short term fees
				driver.findElement(By.partialLinkText("Short-term")).click();
				// clicking on fee calculator
				Thread.sleep(2000);
				driver.findElement(By.partialLinkText("Fee Calculator")).click();
				// clicking lets get started
				Thread.sleep(4000);
				driver.findElement(By.xpath("//*[@id='aside']/div/div/div[2]/div[14]/button[2]")).click();
				// enter valid postcode
				driver.findElement(By.xpath("//*[@id='txtPostCode']")).sendKeys("3011");
				// click next button
				driver.findElement(By.xpath("//*[@id='aside']/div/div/div[2]/div[14]/button[3]")).click();
				Thread.sleep(4000);
				// select vehicle type
				// String labelText;
				// labelText =
				// driver.findElement(By.xpath("//*[@id='aside]/div/div/div[2]/div[3]/div/span")).getText();
				// System.out.println(labelText);
				// click the radio button
				driver.findElement(By.xpath("//*[@id='rbVehicleTypeCar']")).click();
				Thread.sleep(4000);

				// click next for vehicle selection

				driver.findElement(By.xpath("//*[@id=\"aside\"]/div/div/div[2]/div[14]/button[3]")).click();

				Thread.sleep(2000);
				// what type of fule radio button
				driver.findElement(By.xpath("//*[@id='rbFuelTypePetrolDieselLpg']")).click();
				driver.findElement(By.xpath("//*[@id='aside']/div/div/div[2]/div[14]/button[3]")).click();
				// got concession card
				driver.findElement(By.xpath("//*[@id='aside']/div/div/div[2]/div[10]/div[1]/ul/li[2]/label")).click();
				driver.findElement(By.xpath("//*[@id='aside']/div/div/div[2]/div[14]/span/button")).click();

				// printing total price for 3 months

				Thread.sleep(2000);
		//getting the total value for 3 months rego
				String twelvemonts;
				twelvemonts = driver.findElement(By.xpath("//*[@id='aside']/div/div/div[2]/div[13]/div[2]/div[3]/div[1]/dl/dd[2]")).getText();
				System.out.println("12 months value-----------------> " + twelvemonts);
			    Thread.sleep(2000);
				
				
				
				String  registrationFee;
				registrationFee = driver.findElement(By.xpath("//*[@id='aside']/div/div/div[2]/div[13]/div[2]/div[3]/div[2]/ul/li[1]/span")).getText();
				System.out.println("Registration Fee------------------->" + registrationFee);
				Thread.sleep(2000);
				
				String tacCharge;
				tacCharge = driver.findElement(By.xpath("//*[@id='aside']/div/div/div[2]/div[13]/div[2]/div[3]/div[2]/ul/li[2]/span")).getText();
				System.out.println("TAC Charge-------------->" + tacCharge);
				Thread.sleep(2000);
				
				//String insuranceDuty;
				//insuranceDuty = driver.findElement(By.xpath("//*[@id='aside']/div/div/div[2]/div[13]/div[2]/div[3]/div[2]/ul/li[3]/span")).getText();
				//System.out.println("Insurance Duty------------->" + insuranceDuty);
				//Thread.sleep(2000);
				
	
				
				String total;
				total = driver.findElement(By.xpath("//*[@id='aside']/div/div/div[2]/div[13]/div[2]/div[3]/div[2]/ul/li[5]/span")).getText();
				System.out.println("Total--------->" + total);
				Thread.sleep(2000);
				Thread.sleep(2000);
				Thread.sleep(2000);
				Thread.sleep(2000);
				
			}
			
		} 