public class Matrix{
	
	private int[][] matrix;


	public Matrix(int a, int b){
		this.matrix = new int[a][b];

		for(int i = 0; i < a; i++){
			for(int e = 0; e < b; e++){

				matrix[i][e] = 1;
			}
		}
	}

	public void setElement(int a, int b, int set){
		if(a < matrix.length && b < matrix[0].length){
			matrix[a][b] = set;
			System.out.println("The element " + set + " has been added to the matrix");

		} else {

			System.out.println("That location isnt in the matrix.");
		}
	}

	public void setRow(int a, String s){
		if(a < matrix.length && s.length() == matrix[0].length){

			for(int i = 0; i < matrix[0].length; i++){
				System.out.println("This is working");

				matrix[a][i] = Character.getNumericValue(s.charAt(i));
			}

			System.out.println("Row number " + a + " has now been changed to " + s);

		} else {

			System.out.println("That location isnt in the matrix or the string is the wrong size, please try again");
		}
	}

	public void setColumn(int a, String s){
		if(a<matrix[0].length && s.length() == matrix.length){

			for(int i = 0; i < matrix.length; i++){


				matrix[i][a] = Character.getNumericValue(s.charAt(i));
			}

			System.out.println("Column number " + a + " has now been changed to " + s);

		} else {

			System.out.println("That location isnt in the matrix or the string is the wrong size, please try again");
		}
	}

	public String toString(){
		String output = "[";

		for(int a = 0; a < matrix.length; a++){
			for(int i = 0; i < matrix[0].length; i++){
				output += matrix[a][i];
				if(i!=matrix[0].length-1){
					output += ",";
				}
			}

			if(a!=matrix[0].length-1){
				output += ";";				
			}
		}

		output += "]";
		return output;
	}

	public String prettyPrint(){

		String output = "";

		for(int a = 0; a < matrix.length; a++){
			output += "Line " + a + ": ";

			for(int i = 0; i < matrix[0].length; i++){

				output += matrix[a][i];
				if(i!=matrix[0].length-1){

					output += " ,";
				}
			}

			if(a!=matrix[0].length-1){

				output += ".   ";				
			}
		}

		return output;
	}
}





