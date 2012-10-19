public class IntList{
    private int theInt;
    private IntList next, previous;

    public IntList(int theInt){
        this.theInt = theInt;
        this.next = null;
        this.previous = null;
    }
    
    public void addInt(IntList newInt){
        if(this.next == null){
            this.next = newInt;
            newInt.previous = this;
        } else {
            this.next.addInt(newInt);
        }
    }
}
    
    