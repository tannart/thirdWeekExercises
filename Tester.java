public class Tester{
	
	public static void main(String[] args){

		Matrix test = new Matrix(3,3);

		test.setElement(2,3, 675);

		test.setRow(2,"482");
		test.setColumn(1,"999");
		System.out.println(test.toString());
		System.out.println(test.prettyPrint());
	}
}
