package Practise_Package;

import org.testng.annotations.Test;

public class Test1 {
      
	@Test
	public void demo()
	{
		System.out.println("This is demo");
	}
	@Test
	public void call()
	{
		System.out.println("This is call");
		System.out.println("This is not call");
		System.out.println("This is good call");
	}
}
