package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import utill.Driverconnection;

public class KeyboardEvent {
	public static void main(String[] args) {
		
		
		WebDriver driver = Driverconnection.getconnection();
		
		driver.get("https://www.google.co.in/");
		
		WebElement search = driver.findElement(By.name("q"));
		
		Actions builder = new Actions(driver);
		
		
		Action myevent =  builder.click(search)
				.keyDown(Keys.SHIFT)
				.sendKeys("rose")
				.keyUp(Keys.SHIFT)
				.sendKeys(Keys.ENTER)
				.build();
		
		
		myevent.perform();
		
		
	}
}
