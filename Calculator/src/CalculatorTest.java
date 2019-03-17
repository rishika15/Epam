import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculatorTest {

	@Test
	public void testAddition() {
		Calculator c = new Calculator();
		assertEquals(5, c.Addition(2,3));
		assertEquals(-1, c.Addition(2,-3));
		assertEquals(1, c.Addition(-2,3));
	}
	
	@Test
	public void testMultiplication() {
		Calculator c = new Calculator();
		assertEquals(6, c.Multiplication(2,3));
		assertEquals(-6, c.Multiplication(2,-3));
		assertEquals(-6, c.Multiplication(-2,3));
		assertEquals(6, c.Multiplication(-2,-3));
	}
	
	@Test
	public void testDivision() {
		Calculator c = new Calculator();
		assertEquals(1.5, c.Division(3,2));
		assertEquals(-1.5, c.Division(3,-2));
		assertEquals(-1.5, c.Division(-3,2));
		assertEquals(1.5, c.Division(-3,-2));
		Assertions.assertThrows(ArithmeticException.class, () -> c.Division(5, 0));
	}
		

}
