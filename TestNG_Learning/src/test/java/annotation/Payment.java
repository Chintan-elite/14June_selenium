package annotation;

import org.testng.annotations.Test;

public class Payment {
	
	@Test
	public void debitCart()
	{
		System.out.println("Debitcard payment running...");
	}
	
	@Test(groups = "smoke")
	public void creditCart()
	{
		System.out.println("Creditcard payment running...");
	}
	
	@Test(groups = {"sanity","smoke"})
	public void cod()
	{
		System.out.println("cod payment running...");
	}
}
