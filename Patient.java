public class Patient{
    private String name;
	private int age;
	private String illness;
	private Patient next, prev;
    
	public Patient(String name, int age, String illness){
	    this.name = name;
		this.age = age;
		this.illness = illness;
		this.next = null;
		this.prev = null;
	}
	
	public Patient getNext(){
	    return next;
	}
	public Patient getPrev(){
	    return prev;
	}
	public String getName(){
	return name;
	}
	public String getIllness(){
	return illness;
	}
	public int getAge(){
	return age;
	}

    public boolean deletePatient(Patient thePatient){
	    if(this.next == null){
		    return false;
		} else if(this.next.name.equals(thePatient.name)){
		    this.next = next.next;
			this.next.next.prev = this;
			return true;
		} else {
		    return this.next.deletePatient(thePatient);
		}
	}
		
	public void addPatient(Patient newPatient){
	    if(this.next == null){
		    this.next = newPatient;
			newPatient.prev = this;
		} else { 
		    this.next.addPatient(newPatient);
		}
	}
}
		// The addPatient is applied through the most foremost created patient. It takes the newly created patient object in the main method which has been passed into the  addPatient function and holds this in place.
		//Then method then uses an if branch to test whether the currently held objects nextPatient pointer is currently pointing to null, if it is then it assigns the nextPatient pointer to the newly created object, if
		//not then it follows its nextPatient pointer to the next object in the sequence and then by using the dot operator, activates the addPatient method in that object, thus restarting the cycle.
		