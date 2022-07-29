package basic;

import org.testng.annotations.Test;

public class NewTest {
	
	@Test(priority = 3)
	public void test()
	{
		System.out.println("my first Test running...");
	}
	
	@Test(priority = 2)
	public void alpha()
	{
		System.out.println("runing alpha...");
	}
	
	
	@Test(priority = 1,enabled = false)
	public void beta()
	{
		System.out.println("runinng beta");
	}
}
