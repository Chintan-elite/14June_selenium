package basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utill.Driverconnection;

public class LinkTextDemo {
	public static void main(String[] args) {
		
		
		WebDriver driver = Driverconnection.getconnection();
		driver.get("https://www.facebook.com/");
		
		//driver.findElement(By.linkText("Forgotten password?")).click();
		
		List<WebElement> links =  driver.findElements(By.partialLinkText("Create"));
//		for(WebElement link : links)
//		{
//			System.out.println(link.getText());
//		}
		links.get(1).click();
	}
}
