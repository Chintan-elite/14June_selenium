package com;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import utill.Driverconnection;

public class DataDriven {
		
	WebDriver driver;
	@BeforeClass
	public void open()
	{
		driver = Driverconnection.getconnection();
		driver.get("http://topshrms.in/");
	}
	
	@Test(dataProvider = "dp")
	public void test(String username, String password)
	{
		
		WebElement uname =  driver.findElement(By.id("l_username"));
		uname.clear();
		uname.sendKeys(username);
		WebElement pass =  driver.findElement(By.id("l_password"));
		pass.clear();
		pass.sendKeys(password);
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.findElement(By.xpath("//*[@id=\"frm_login\"]/div[3]/button")).click();
		
		String eMsg = driver.findElement(By.xpath("//*[@id=\"frm_login\"]/div[1]/span")).getText();
		assertEquals(eMsg, "You have entered wrong username and password.");
		
		
		
		driver.navigate().back();
		
		
	}
	
	@DataProvider(name = "dp")
	public Object[][] getdata()
	{
		 ExcellReader rd = new ExcellReader("C:\\Users\\chintan\\Desktop\\Login.xlsx","login");
		 int rows =   rd.getRowCount();
		 int cols = rd.getColCount();
	
		Object obj[][] = new Object[rows-1][cols];
		
		 for(int i=1;i<rows;i++)
		 {
			 for(int j=0;j<cols;j++)
			 {
				 String data = rd.getData(i, j);
				 obj[i-1][j] = data;
			 }
		 }
		
		return obj;
	}
}
