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
        
    public double divide(int x , int y){
        double x2 = (double) x;
        double y2 = (double) y;
        double z2 = x2/y2;
        return z2;
    }
    
    public int modulus(int x, int y){
        int z = x % y;
        return z;
    }
}