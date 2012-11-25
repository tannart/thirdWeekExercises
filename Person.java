public class Person{
	private Person next;
	private String name;

	public Person(String name){
		this.name = name;
		this.next = null;
	}

	public void addPerson(Person newPerson){
		if(this.next == null){
			this.next = newPerson;
			System.out.println("A new person has been added to the Queue: " + newPerson.getName());
		} else {
			this.next.addPerson(newPerson);
		}
	}
	public Person getNext(){
		return next;
	}

	public String getName(){
		return name;
	}


}