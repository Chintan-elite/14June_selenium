package basic;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utill.Driverconnection;

public class MultipleWindows {
	public static void main(String[] args) {
		
		WebDriver driver = Driverconnection.getconnection();
		driver.get("https://demo.guru99.com/popup.php");
		
		String Mainwin =   driver.getWindowHandle();
		System.out.println("Main windows :  "+Mainwin);
		
		
		driver.findElement(By.linkText("Click Here")).click();
		
		Set<String> allWins = driver.getWindowHandles();
		for(String wins : allWins)
		{
			if(!wins.equals(Mainwin))
			{
				driver.switchTo().window(wins);
				driver.findElement(By.name("emailid")).sendKeys("tops@gmail.com");
				driver.findElement(By.name("btnLogin")).click();
				
				
			}
		}
		
		driver.close();
		
	}
}
