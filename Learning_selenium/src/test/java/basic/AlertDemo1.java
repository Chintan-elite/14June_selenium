package basic;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utill.Driverconnection;

public class AlertDemo1 {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = Driverconnection.getconnection();
		driver.get("https://demoqa.com/alerts");
		
		WebElement alertButton = driver.findElement(By.id("alertButton"));
		WebElement timerAlertButton = driver.findElement(By.id("timerAlertButton"));
		WebElement conirmButton = driver.findElement(By.id("confirmButton"));
		WebElement promtButton = driver.findElement(By.id("promtButton"));

		
		//promtButton.click();
		//alertButton.click();
		timerAlertButton.click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		
		wait.until(ExpectedConditions.alertIsPresent());
		
		
		Alert alert = driver.switchTo().alert();
		//alert.sendKeys("Tops tech");
		alert.accept();
		
		
		
		
	}
}
