package javaBasics;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertDemo {
	
	@Test
     public void testHardAssert() {
		// TODO Auto-generated method stub
		
		//Assert.assertEquals(12, 13);
		
		//Assert.assertEquals(12, 13,"Not matching");
		
		Assert.assertEquals("wert", "yusd","Strings not matching");
		
		System.out.println("Execution continued");

	}
	
	@Test
	public void testSoftAssert(){
		
		SoftAssert assertion = new SoftAssert();
		assertion.assertAll();
		
		assertion.assertEquals(12, 14,"Not matching");
		
		System.out.println("Test completed");
		
		
		
		
	}

}
