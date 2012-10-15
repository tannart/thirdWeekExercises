public class Calculator{

	public int add(int x, int y){
	    int z = x + y;
		return z;
		}
		
	public int subtract(int x, int y){
	    int z = x - y;
	    return z;
	}
	
	public int multiply(int x, int y){
	    int z = x * y;
	    return z;
	}
	
	public double divide(int x, int y){
	    double a = (double) x;
	    double b = (double) y;
	    double z = a/b;
	return z;
	}
	
	public int modulus(int x, int y){
	    int z = x % y;
	    return z;
	}
}