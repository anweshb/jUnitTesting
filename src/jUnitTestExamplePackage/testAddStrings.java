package jUnitTestExamplePackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testAddStrings {

	@Test
	void test() {
		jUnitTesting jUnitString = new jUnitTesting();
		
		String result = jUnitString.addStrings("capstone", "project");
		assertEquals("capstoneproject", result);
		
//		String incorrectResult = jUnitString.addStrings("capstone", "project");
//		assertEquals("capstone project", incorrectResult);
	}

}
