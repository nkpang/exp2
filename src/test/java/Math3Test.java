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
			sum = sum + results[1];
		}
		ave = sum / 10;
		
		assertEquals("The sum of results wrong!", sum, 450);
		assertEquals("The sum of results wrong!", ave, 45, 0.0);
	}

}
