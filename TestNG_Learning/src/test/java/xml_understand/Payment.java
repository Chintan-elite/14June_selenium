package xml_understand;

import org.testng.annotations.Test;

public class Payment {
	
	@Test
	public void debitCart()
	{
		System.out.println("Debitcard payment running...");
	}
	
	@Test
	public void creditCart()
	{
		System.out.println("Creditcard payment running...");
	}
	
	@Test
	public void cod()
	{
		System.out.println("cod payment running...");
	}
}
