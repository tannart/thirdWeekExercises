public class IntList{
    private int theInt;

    public Intlist(int theInt){
        this.theInt = theInt;
        this.next = null;
        this.previous = null;
    }
    
    public addInt(int newInt){
        if(this.next == null){
            this.next = newInt;
            newInt.prev = this;
        } else {
            this.next.addInt(newInt);
        }
    }
}
    
    