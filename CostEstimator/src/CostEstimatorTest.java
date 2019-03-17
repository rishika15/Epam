import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * 
 * @author prudhvir3ddy
 *
 */
class CostEstimatorTest {

	@Test
	void testCostEstimator() {
		CostEstimator ce;
		ce = new CostEstimator(0, 250, false);
		assertEquals(300000.0, ce.findCost());
		ce = new CostEstimator(0, 250.562585, false);
		assertEquals(300675.102, ce.findCost());
		ce = new CostEstimator(2, 1, true);
		assertEquals(2500, ce.findCost());
		ce = new CostEstimator(2, 1, false);
		assertEquals(1800, ce.findCost());
		
	}

}
