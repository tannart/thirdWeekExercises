public class ArrayCopier{
	
	public void copy(int[] src, int[] dst){

		for(int i = 0; i < dst.length; i ++){

			if(i<src.length){
				dst[i] = src[i];

			} else {

				dst[i] = 0;
			}
		}

		for(int a = 0; a < dst.length; a++){

			System.out.println(dst[a]);
		}
	}
}