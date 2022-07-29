package basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TitleCheck {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\BrowserDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		String expectedTitle =  "Facebook login";
		String actualTitle = driver.getTitle();
		
		if(expectedTitle.equals(actualTitle))
		{
			System.out.println("Test passed !!!");
		}
		else
		{
			System.out.println("Test failed !!!");
		}
		
		driver.close(); // it will close particular window
		//driver.quit(); // it will close all windows
	}
}
