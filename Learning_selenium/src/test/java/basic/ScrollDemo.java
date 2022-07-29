package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utill.Driverconnection;

public class ScrollDemo {
	public static void main(String[] args) {
		
		
		WebDriver driver = Driverconnection.getconnection();
		driver.get("https://www.amazon.in/");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
	
		WebElement fb = driver.findElement(By.linkText("Facebook"));
		
		js.executeScript("arguments[0].scrollIntoView(true);", fb);
		
		//js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	
		//js.executeScript("window.scrollBy(0,100)");
	
	}
}
