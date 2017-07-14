
public class Math {
	
	public Math() {}
	
	static public int add(int a, int b) {   
        return a + b; 
	}
	
	static public int minus(int a, int b) {   
        return a - b; 
	}
	
	static public int multiply(int a, int b) {   
        return a * b; 
	}
		
	static public double divide(int a, int b){
		double c=0.0;
		try{
			c= a/b;
		}catch(Exception e) {
			throw new IllegalArgumentException();
		}
		return c;
	}
	
	public static void main(String[] args) {
		System.out.println("Add function : 3 + 9 = " + Math.add(9, 3));
		System.out.println("Subtract function : 3 + 9 = " + Math.minus(9, 3));
		System.out.println("Multiply function : 3 + 9 = " + Math.multiply(9, 3));
		System.out.println("Add function : 3 + 9 = " + Math.divide(9, 3));
	}
}
