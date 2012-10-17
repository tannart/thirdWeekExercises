public class CalculatorTest{
    public static void main(String [] args){
    
        int x = 5;
        int y = 6;
       
        Calculator theCalculator = new Calculator();
        System.out.println(theCalculator.add(x,y));
        System.out.println(theCalculator.subtract(x,y));
        System.out.println(theCalculator.multiply(x,y));
        System.out.println(theCalculator.divide(x,y));
        System.out.println(theCalculator.modulus(x,y));
       
       
   }
}    