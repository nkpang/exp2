import static org.junit.Assert.*;

import org.junit.Test;

public class Math2Test {
	
	@Test
	public void testMutliply(){
		int m = Math.multiply(3, 2);
		assertEquals("Wrong answer", 6, m);
	}
	
	@Test
	public void testDivide() {
		assertEquals("Wrong answer", (double)(3/2), Math.divide(3, 2), 0.0); 
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testDivideFailed() {
		Math.divide(3, 0);
  	}
}
