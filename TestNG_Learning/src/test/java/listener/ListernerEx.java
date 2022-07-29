package listener;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class ListernerEx {
	
	@Test
	public void test1()
	{
		System.out.println("running test1");
	}
	
	@Test
	public void test2()
	{
		assertTrue(false);
		System.out.println("running test2");
		
	}
}
