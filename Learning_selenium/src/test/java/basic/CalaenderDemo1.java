package basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utill.Driverconnection;

public class CalaenderDemo1 {
	public static void main(String[] args) {
		
		WebDriver driver =Driverconnection.getconnection();
		driver.get("https://www.globalsqa.com/demo-site/datepicker/#DropDown%20DatePicker");
		
		//driver.findElement(By.xpath("//ul[@class='resp-tabs-list ']/li[2]")).click();
		
//		List<WebElement> frames = driver.findElements(By.tagName("iframe"));
//		for(WebElement frame : frames)
//		{
//			System.out.println(frame.getAttribute("data-src"));
//		}
		
		driver.switchTo().frame(4);
		driver.findElement(By.id("datepicker")).click();
		
		
		
	}
}
