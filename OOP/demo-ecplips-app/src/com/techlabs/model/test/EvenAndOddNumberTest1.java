package com.techlabs.model.test;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import com.techlabs.model.*;

class EvenAndOddNumberTest1 {
	// Arrange
	EvenAndOddNumbers obj = new EvenAndOddNumbers();
	int[] odd = obj.getOddNumbers();
	int[] even = obj.getEvenNumbers();
	int expectedlastNumberOfOddArray = 99, expectedlastNumberOEvenArray = 100, expectedFirstNumberOfOddArray = 1,
			expectedFirstNumberOfEvenArray = 2;

	// Act
	int actualLastNumberOfOddArray = odd[odd.length - 1];
	int actualFirstNumberOfOddArray = odd[0];
	int actualLastNumberOfEvenArray = even[even.length - 1];
	int actualFirstNumberOfEvenArray = even[0];
	
	
	// Assert
	@Test
	@TestFirstNumberOfArray
	void testFirstNumberOfOddAndEven() {
		assertEquals(expectedFirstNumberOfOddArray, actualFirstNumberOfOddArray);
		assertEquals(expectedFirstNumberOfEvenArray, actualFirstNumberOfEvenArray);
	}

	@TestLastNumberOfArray
	void testLastNumberOfOddAndEven() {
		assertEquals(expectedlastNumberOfOddArray, actualLastNumberOfOddArray);
		assertEquals(expectedlastNumberOEvenArray, actualLastNumberOfEvenArray);
	}
}
