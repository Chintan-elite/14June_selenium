package basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Registration {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\BrowserDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		
		
		driver.findElement(By.linkText("Create New Account")).click();
		
		Thread.sleep(2000);
		
		
		driver.findElement(By.name("firstname")).sendKeys("tops");
		driver.findElement(By.name("lastname")).sendKeys("tech");
		driver.findElement(By.name("reg_email__")).sendKeys("tops2gmail.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("tops?123");
		
		WebElement day = driver.findElement(By.id("day"));
		WebElement month = driver.findElement(By.id("month"));
		WebElement year = driver.findElement(By.id("year"));
		
		Select days = new Select(day);
		Select months = new Select(month);
		Select years = new Select(year);
		
		days.selectByVisibleText("10");
		months.selectByValue("4");
		years.selectByIndex(8);
		
		
		List<WebElement> gender = driver.findElements(By.name("sex"));
		System.out.println(gender.size());
		
		gender.get(1).click();
		
		
	}
}
