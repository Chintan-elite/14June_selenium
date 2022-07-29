package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utill.Driverconnection;

public class MouseEvent2 {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = Driverconnection.getconnection();
		driver.get("https://www.amazon.in/");
	
		WebElement bs  =driver.findElement(By.linkText("Best Sellers"));
		WebElement mobile = driver.findElement(By.linkText("Mobiles"));
		WebElement fashion = driver.findElement(By.linkText("Fashion"));
		
		Actions builder = new Actions(driver);
		
		builder.moveToElement(bs).build().perform();
		Thread.sleep(2000);
		builder.moveToElement(mobile).build().perform();
		Thread.sleep(2000);
		builder.moveToElement(fashion).build().perform();
	}
	
	
}
