package com;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class CalcTest_para {
	
	int a;
	int b;
	int result;
	
	public CalcTest_para(int a, int b, int result) {
		
		this.a = a;
		this.b = b;
		this.result = result;
	}

	@Test
	public void addTest()
	{
		Calc c = new Calc();
		int actual =  c.add(a, b);
		int expected = result;
		assertEquals(expected, actual);
	}
	
	@Parameters
	public static List<Object[]> getdata()
	{
		Object obj[][] = new Object[4][3];
		
		obj[0][0] = 20;
		obj[0][1] = 30;
		obj[0][2] = 50;
		
		obj[1][0] = 200;
		obj[1][1] = 300;
		obj[1][2] = 500;
		
		obj[2][0] = 120;
		obj[2][1] = 130;
		obj[2][2] = 250;
		
		obj[3][0] = 20;
		obj[3][1] = 300;
		obj[3][2] = 320;
		
		return Arrays.asList(obj);
	}
	
}
