package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utill.Driverconnection;

public class StaticWebTable {
	public static void main(String[] args) {
		
		
		WebDriver driver = Driverconnection.getconnection();
		driver.get("https://www.softwaretestingo.com/handle-static-web-table-in-selenium/");
		
		String xpath = "//table/tbody/tr[2]/td[2]";
		
		String data =  driver.findElement(By.xpath(xpath)).getText();
		System.out.println(data);
		
		
	}
}
