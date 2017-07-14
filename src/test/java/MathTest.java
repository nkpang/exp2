import static org.junit.Assert.*;
import org.junit.Test;

public class MathTest {
	@Test
	public void testAdd() {
        assertEquals("Wrong answer", 5, Math.add(2,3)); 
	}
	
	@Test
	public void testMinus() {
		assertEquals("Wrong answer", 2, Math.minus(5,3)); 
	}
	
	@Test
	public void testMathConstructor(){
		Math m = new Math();
		assertNotNull("Error in constructor", m);
	}
	
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
