import static org.junit.Assert.*;

import org.junit.Test;

public class Math3Test {

	@Test
	public void testMathMain(){
		// TODO Auto-generated method stub
		int[] results = new int[]{67,45,90,54,87,25,58,66,78,69};
		int sum = 0;
		double ave = 0.0;
		for (int i=0; i<10; i++) {
			sum = Math.add(sum, results[i]);
		}
		ave = Math.divide(sum, results.length);
		
		assertEquals("The sum of results wrong!", sum, 639);
		assertEquals("The sum of results wrong!", ave, 63.0, 0.0);
	}

}
