public class Math3Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] results = new int[]{67,45,90,54,87,25,58,66,78,69};
		int sum = 0;
		double ave = 0.0;
		for (int i=0; i<10; i++) {
			sum = sum + results[1];
		}
		ave = sum / 10;
		
		System.out.println("The sum of results is " + sum);
		System.out.println("The average score is " + ave);
	}

}
