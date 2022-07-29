package annotation;

import org.testng.annotations.Test;

public class Mytest {
	
	@Test(groups = "smoke")
	public void loginTest()
	{
		System.out.println("Runnig login test");
	}
	
	@Test
	public void logoutTest()
	{
		System.out.println("running logout test");
	}
	
	@Test(groups = "sanity")
	public void home()
	{
		System.out.println("running home test");
	}
}
