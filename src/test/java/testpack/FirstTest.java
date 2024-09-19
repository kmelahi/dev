package testpack;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import samplepack.AddNumbers;

public class FirstTest {

	@Test
	public void testAddition() {
		AddNumbers addNumbers = new AddNumbers();
		assertEquals(5, addNumbers.addNumbers(3, 2));
	}

}
