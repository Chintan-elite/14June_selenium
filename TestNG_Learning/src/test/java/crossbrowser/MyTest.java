package crossbrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import utill.Driverconnection;

public class MyTest {
	
	@Parameters({"uname","pass","browser"})
	@Test
	public void test(String username, String password,String browser)
	{
		WebDriver driver=null;
		if(browser.equals("chrome")) {
			 driver = Driverconnection.getconnection();
			
		}
		else if(browser.equals("ff"))
		{
			System.setProperty("webdriver.gecko.driver", "D:\\BrowserDriver\\geckodriver.exe");
			 driver = new FirefoxDriver();
		}
	
		driver.get("http://topshrms.in/");
		driver.findElement(By.id("l_username")).sendKeys(username);
		driver.findElement(By.id("l_password")).sendKeys(password);
		driver.findElement(By.xpath("//*[@id=\"frm_login\"]/div[3]/button")).click();
	}
}
