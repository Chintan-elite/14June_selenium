package listener;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.annotations.Test;

import utill.Driverconnection;

public class MyTest {
	
	@Test
	public void titleCheck(ITestContext i)
	{
		WebDriver driver = Driverconnection.getconnection();
		driver.get("https://www.facebook.com/");
		i.setAttribute("driver", driver);
		assertEquals("FaceBook", driver.getTitle());
	}
	
	@Test
	public void logincheck(ITestContext i)
	{
		WebDriver driver = Driverconnection.getconnection();
		driver.get("https://www.facebook.com/");
		i.setAttribute("driver", driver);
		driver.findElement(By.id("email")).sendKeys("toks");
		driver.findElement(By.id("pass")).sendKeys("123456");
		driver.findElement(By.name("login")).click();
		
		assertEquals("FaceBook", driver.getTitle());
		
	}
	
	
}
