package parameter;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import utill.Driverconnection;

public class LoginTest_Multiparameter {
	
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
		
		driver.findElement(By.xpath("//*[@id=\"frm_login\"]/div[3]/button")).click();
		
		String eMsg = driver.findElement(By.xpath("//*[@id=\"frm_login\"]/div[1]/span")).getText();
		assertEquals(eMsg, "You have entered wrong username and password.");
		
		driver.navigate().back();
		
		
	}
	
	@DataProvider(name = "dp")
	public Object[][] getdata()
	{
		Object obj[][] = new Object[4][2];
		
		obj[0][0] = "tops123";
		obj[0][1] = "tops@123";
		
		obj[1][0] = "aaa@123";
		obj[1][1] = "tops@123";
		
		obj[2][0] = "xyz@123";
		obj[2][1] = "tops@123";
		
		obj[3][0] = "pqr@123";
		obj[3][1] = "tops@123";
		
		return obj;
	}
	
	
}
