package com.demoapp.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class TC_LoginTest {
	
	@Test
	public void loginTest()
	{
		System.setProperty("webdriver.chrome.driver", "./Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/v4/index.php");
		driver.manage().window().maximize();
		
		Assert.assertEquals("Guru99 Bank Home Page", driver.getTitle());
	}
}
