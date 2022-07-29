package basic;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utill.Driverconnection;

public class XpathDemo {
	public static void main(String[] args) {
		
	WebDriver driver = Driverconnection.getconnection();
	driver.get("https://topsint.com/topserp/index.php");
		
	driver.findElement(By.xpath("//input[@id='l_username']")).sendKeys("Tops");
		
		
	}
}
