package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utill.Driverconnection;

public class WebTable_TextXpath {
	public static void main(String[] args) {
		
		WebDriver driver = Driverconnection.getconnection();
		driver.get("https://demoqa.com/webtables");
		String uname = "Cierra";
		
		WebElement name = driver.findElement(By.xpath("//*[text()='"+uname+"']"));
		
		if(name.isDisplayed())
		{
			driver.findElement(By.xpath("//*[text()='"+uname+"']/following-sibling::div[6]/div/span[1]")).click();
		}
		else
		{
			System.out.println("Not available");
		}
		
		
	}
}
