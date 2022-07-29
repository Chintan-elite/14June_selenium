package basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utill.Driverconnection;

public class TagnameDemo {
	public static void main(String[] args) {
		
		WebDriver driver = Driverconnection.getconnection();
		driver.get("https://www.facebook.com/");
		
		List<WebElement> links = driver.findElements(By.tagName("input"));
		System.out.println(links.size());
		for(WebElement link : links)
		{
			System.out.println(link.getAttribute("name"));
		}
		
		
		
		driver.quit();
	}
}
