public class UtilitiesList{

    public UtilitiesList(){
    }
    
    public static IntList arrayToList(int[] theArray){ //method converting the input array to a list.
        for(int i = 1; i < theArray.length; i++){
            beginIntList.AddInt(theArray[i]);
        }
    }
}