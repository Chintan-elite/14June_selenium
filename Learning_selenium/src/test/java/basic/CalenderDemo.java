package basic;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utill.Driverconnection;

public class CalenderDemo {
	public static void main(String[] args) throws InterruptedException {
		
		String mydate = "10";
		String myMonth = "August";
		WebDriver driver = Driverconnection.getconnection();
		driver.get("https://www.globalsqa.com/demo-site/datepicker/#Icon%20Trigger");
	
		
		List<WebElement> frames = driver.findElements(By.tagName("iframe"));
//		for(WebElement frame : frames)
//		{
//			System.out.println(frame.getAttribute("data-src"));
//		}
		
		driver.switchTo().frame(3);
		
		
		
		driver.findElement(By.id("datepicker")).click();
		
		
		String month = driver.findElement(By.className("ui-datepicker-month")).getText();
		
		while(!(driver.findElement(By.className("ui-datepicker-month")).getText()).equals(myMonth))
		{
			driver.findElement(By.xpath("//*[@data-handler='next']")).click();
		}
		
		
		
		
		
		
		List<WebElement> rows = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr"));
		for(int i=1;i<=rows.size();i++)
		{
			List<WebElement> cols = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr["+i+"]/td"));
			for(WebElement col : cols)
			{
				String dt = col.getText();
				if(dt.equals(mydate))
				{
					col.click();
					break;
				}
			}
		}
		
		
		Thread.sleep(5000);		
		driver.quit();
	}
}
