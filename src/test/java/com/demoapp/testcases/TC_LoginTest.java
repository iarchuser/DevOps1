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
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/v4/index.php");
		Assert.assertEquals("Guru99 Bank Home Page", driver.getTitle());
		driver.quit();
	}
}
