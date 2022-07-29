package com;

import static org.junit.Assert.assertEquals;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utill.Driverconnection;

public class AnnotaionTest {
	
	static WebDriver driver;
	@BeforeClass
	public static void setUp()
	{
		driver = Driverconnection.getconnection();
		driver.get("https://www.facebook.com/");
		
	}
	
	@Test
	public void titleCheck()
	{
		assertEquals("Facebook – log in or sign up", driver.getTitle());
	}
	
	@Test
	public void login()
	{
		driver.findElement(By.id("email")).sendKeys("testdatadcfg");
		driver.findElement(By.id("pass")).sendKeys("4rtg4567");
		driver.findElement(By.name("login")).click();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		assertEquals("Log in to Facebook", driver.getTitle());
		
	}
	
	@AfterClass
	public static void close()
	{
		driver.close();
	}
}
