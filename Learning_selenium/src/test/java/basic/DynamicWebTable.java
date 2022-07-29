package basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utill.Driverconnection;

public class DynamicWebTable {
	public static void main(String[] args) {
		
		
		WebDriver driver = Driverconnection.getconnection();
		driver.get("https://www.softwaretestingo.com/handle-static-web-table-in-selenium/");
		
		List<WebElement> rows = driver.findElements(By.xpath("//table/tbody/tr"));
		for(int i=2;i<=rows.size();i++)
		{
			List<WebElement> cols = driver.findElements(By.xpath("//table/tbody/tr["+i+"]/td"));
			for(int j=1;j<=cols.size();j++)
			{
				String data = driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td["+j+"]")).getText();
				System.out.print(data+" ");
			}
			System.out.println();
		}
		driver.close();
	}
}
