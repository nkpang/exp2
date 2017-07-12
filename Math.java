
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
}
