package com;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Annotationdemo {

	@Test
	public void alpha()
	{
		System.out.println("running alpha test");
	}
	
	@Test
	public void beta()
	{
		System.out.println("running beta test");
	}
	
	@Before
	public void beforeEveryTest()
	{
		System.out.println("This method will run before everytest");
	}
	
	@After
	public void afterEveryTest()
	{
		System.out.println("This method will run after everytest");
	}
	
	@BeforeClass
	public static void start()
	{
		System.out.println("running before all test");
	}
	
	@AfterClass
	public static void end()
	{
		System.out.println("running after all test");
	}
}
