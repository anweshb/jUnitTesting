package jUnitTestExamplePackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testAddNumbers {

	@Test
	void test() {
		jUnitTesting junit = new jUnitTesting();
		int result = junit.addNumbers(100, 200);
		assertEquals(300, result);
//		
//		int incorrectResult = junit.addNumbers(101, 200);
//		assertEquals(300, incorrectResult);
	}

}
