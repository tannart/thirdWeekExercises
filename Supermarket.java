public class Supermarket{
	
	public static void main(String[] args){

		Person bob = new Person("bob");
		Person tim = new Person("tim");
		Person jeff = new Person("jeff");
		Person tony = new Person("tony");
		Person joe = new Person("joe");
		Person jake = new Person("jake");

		Queue theQueue = new Queue();

		theQueue.insert(bob);
		theQueue.insert(tim);
		theQueue.insert(jeff);
		theQueue.insert(tony);
		theQueue.insert(joe);
		theQueue.insert(jake);

		theQueue.size();

		theQueue.retrieve();
		theQueue.retrieve();
		theQueue.retrieve();

		theQueue.size();

	}
}