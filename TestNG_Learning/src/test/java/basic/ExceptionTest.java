package basic;

import org.testng.annotations.Test;

public class ExceptionTest {
	
	@Test(expectedExceptions = ArrayIndexOutOfBoundsException.class)
	public void test() {
		
//		int a = 10;
//		int j = a/0;
		
		int a[] = new int[5];
		a[6]= 56;
		
		
	}
}
