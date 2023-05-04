package Testng.task1;

import org.testng.annotations.Test;

import Base.module.BaseClass;

public class Practice extends BaseClass{
	

	@Test(priority=100) // priority is to execute the order based priority vaue low to high
	private void test1() {
		System.out.println("test1");
				
	}
	@Test(priority=50,enabled =false) // enabled is user to ignore the perticular test
	private void test2() {
		System.out.println("test2");
	}
	@Test(priority=-80,invocationCount=5) //invocationCount is used to run the test multiple time
	private void test3() {
		System.out.println("test3");
	}
	@Test(priority=-700)
	private void test4() {
		System.out.println("test4");

	}
}
