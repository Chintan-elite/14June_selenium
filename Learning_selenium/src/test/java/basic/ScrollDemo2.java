package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utill.Driverconnection;

public class ScrollDemo2 {
	public static void main(String[] args) {
		
		WebDriver driver = Driverconnection.getconnection();
		driver.get("https://www.facebook.com/");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
	
		WebElement privacy = driver.findElement(By.linkText("Privacy"));
		
		//js.executeScript("arguments[0].scrollIntoView(true);", privacy);
		
		//js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	
		js.executeScript("window.scrollBy(0,100)");
	}
}
