public class Matrix{
    int[][] matArray;
	int column;
	
	Matrix(int row, int column){
	    matArray = new int[row][column];
		for(int i = 0; i < row; i++){
		    for(int j = 0; j< column; j++){
		    matArray[i][j] = 1;
			}
		}
	}
	int setElement(int row, int column, int value){
	    matArray[row][column] = value;	
		return column;
	}
	void setRow(int row, String values){
	    for(int i = 0; i = row.length-1; i++){
		    
}
