package co.sumit;

import java.util.Date;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculateServiceTest {
	
	//Method init should be static
	@BeforeClass
	public static void init() {
		System.out.println("Before all test cases...");
		System.out.println("Started test at : "+new Date());
	}
	
	@Test
	public void addTwoNumbersTest() {
		int result = CalculateService.addTwoNumbers(12, 50);
		int expected= 62;
		Assert.assertEquals(expected, result);
		//actual result
		
		//expected result
	}
}
