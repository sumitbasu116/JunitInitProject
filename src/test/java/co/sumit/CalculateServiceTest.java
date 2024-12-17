package co.sumit;

import org.junit.Assert;
import org.junit.Test;

public class CalculateServiceTest {
	
	@Test
	public void addTwoNumbersTest() {
		int result = CalculateService.addTwoNumbers(12, 50);
		int expected= 62;
		Assert.assertEquals(expected, result);
		//actual result
		
		//expected result
	}
}
