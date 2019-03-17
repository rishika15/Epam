import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
/**
 * 
 * @author prudhvir3ddy
 *
 */
class SimpleIntrestAndCompoundIntrestTest {

	@Test
	void testSimpleIntrest() {
		SimpleIntrestAndCompoundIntrest simpleIntrest;
		simpleIntrest = new SimpleIntrestAndCompoundIntrest(20202, 2.5f, 3);
		assertEquals(1515.1500244140625, simpleIntrest.calcSimpleIntrest());
		simpleIntrest = new SimpleIntrestAndCompoundIntrest(20202, 2.5f, 5);
		assertEquals(2525.25, simpleIntrest.calcSimpleIntrest());
	}
	
	@Test
	void testCompoundIntrest() {
		SimpleIntrestAndCompoundIntrest compoundIntrest;
		compoundIntrest = new SimpleIntrestAndCompoundIntrest(20202, 2.5f, 3);
		assertEquals(21755.342888139312, compoundIntrest.calcCompoundIntrest());
		compoundIntrest = new SimpleIntrestAndCompoundIntrest(20202, 2.5f, 5);
		assertEquals(22856.7060585414, compoundIntrest.calcCompoundIntrest());
	}

}
