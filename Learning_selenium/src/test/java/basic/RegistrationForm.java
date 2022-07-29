package basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import utill.Driverconnection;

public class RegistrationForm {
	public static void main(String[] args) {
		
		WebDriver driver = Driverconnection.getconnection();
		driver.get("https://demoqa.com/automation-practice-form");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		
		driver.findElement(By.id("firstName")).sendKeys("tops");
		driver.findElement(By.id("lastName")).sendKeys("tech");
		driver.findElement(By.id("userEmail")).sendKeys("tops@gmail.com");		
	
		//List<WebElement> gender = driver.findElements(By.name("gender"));
		//System.out.println(gender.size());
		//gender.get(1).click();
		driver.findElement(By.xpath("//*[@id=\"genterWrapper\"]/div[2]/div[2]/label")).click();
		
		driver.findElement(By.id("userNumber")).sendKeys("9586746352");
		
		driver.findElement(By.id("dateOfBirthInput")).click();
		
		String myYear = "1993";
		String myMonth = "June";
		String myDate = "20";
		WebElement month = driver.findElement(By.xpath("//*[@class='react-datepicker__month-select']"));
		Select months = new Select(month);
		months.selectByVisibleText(myMonth);
		
		
		WebElement year = driver.findElement(By.xpath("//*[@class='react-datepicker__year-select']"));
		Select years = new Select(year);
		years.selectByVisibleText(myYear);
		
		
		List<WebElement> dates = driver.findElements(By.xpath("//*[@class='react-datepicker__week']/div"));
		//System.out.println(dates.size());
		
		for(WebElement date : dates)
		{
			String dt = date.getText();
			if(dt.equals(myDate))
			{
				if(date.getAttribute("aria-label").contains(myMonth))
				{
					date.click();
					break;
				}
				
			}
		}
		
		Actions builder = new Actions(driver);
		WebElement subject = driver.findElement(By.id("subjectsContainer"));
		builder.click(subject)
				.sendKeys("physics")
				.sendKeys(Keys.ENTER)
				.build()
				.perform();
		
		driver.findElement(By.xpath("//*[@id='hobbiesWrapper']/div[2]/div[2]/label")).click();
		
		driver.findElement(By.id("uploadPicture")).sendKeys("C:\\Users\\chintan\\Desktop\\logo-tops.png");
		
		driver.findElement(By.id("currentAddress")).sendKeys("surat,gujarat,india");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.quit();
	}
}
