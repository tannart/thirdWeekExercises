public class TestCode{
	public static void main(String[] args){
		int[] src = {0,1,2,3,4,5};
		int[] dst = new int[7];
		
		ArrayCopier myCopier = new ArrayCopier();
		myCopier.copy(src,dst);
		
		for(int i=0; i<dst.length; i++){
			System.out.println(dst[i]); // you can't simply print out the array as an entire structure, instead you must 
			// increment through each position of the array as shown above.
		}
	}
}