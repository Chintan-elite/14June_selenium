package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utill.Driverconnection;
import utill.ScreenShot;

public class ScreenshotDemo {
	public static void main(String[] args) {
		
		WebDriver driver = Driverconnection.getconnection();
		driver.get("https://www.amazon.in/");
		 
		ScreenShot.getScreenShot(driver,"D:\\img\\home.png");
		
		driver.findElement(By.linkText("Sign in")).click();
		
		ScreenShot.getScreenShot(driver,"D:\\img\\login.png");
		
	}
}
