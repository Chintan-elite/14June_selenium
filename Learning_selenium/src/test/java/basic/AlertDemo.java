package basic;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utill.Driverconnection;

public class AlertDemo {
	public static void main(String[] args) {
		
		WebDriver driver = Driverconnection.getconnection();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		
		
		driver.findElement(By.name("cusid")).sendKeys("10");
		driver.findElement(By.name("submit")).click();
		
		Alert alert =  driver.switchTo().alert();
		
		System.out.println(alert.getText());
		//alert.accept();
		alert.dismiss();
	}
}
