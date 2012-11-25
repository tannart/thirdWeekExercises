public class Queue{
	private Person current;
	private Person next;


	public Queue(){
		this.next = null;
		this.current = null;
	}

	public void insert(Person newPerson){
		if(this.current == null){
			this.current = newPerson;
			System.out.println("A new person has been added to the Queue: " + newPerson.getName());
		} else {
			this.current.addPerson(newPerson);
		}
	}

	public void retrieve(){
		Person nameHolder = this.current;
		this.next = this.current.getNext();
		this.current = this.next;
		System.out.println(nameHolder.getName() + " has been served.");
		this.next = null;
	}

	public int size(){
		int size = 0;

		if(this.current != null){
			size ++;
			Person marker = this.current;
			while(marker.getNext() != null){
				marker = marker.getNext();
				size++;
			}
		} else {
			System.out.println("There is noone in the Queue");
		}
		System.out.println("The Queue currently contains " + size + " People.");
		return size;
	}

}