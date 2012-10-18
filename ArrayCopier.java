public class ArrayCopier{

	public void copy(int[] x, int[] y){
		int i;
		for(i=0; i<x.length&&i<y.length; i++){
			y[i]=x[i];
		}
		
		while(i<y.length){
			y[i]=0;
			i++;
		}
	}
	
}