public class Patient{
    private String name;
	private int age;
	private String illness;
	private Patient nextPatient, prevPatient;

    public Patient(String name, int age, String illness){ //create patient object
	    this.name = name;
	    this.age = age;
	    this.illness = illness;
	    this.nextPatient = null;
		this.prevPatient = null;
	}
	
	public Patient getNextPatient(){
	    return nextPatient;
	}
	public Patient getPrevPatient(){
	    return prevPatient;
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
	
    public getPatientListEnd(){
	    return endPatient;
	}
	    
	
	    public void addPatient(Patient newPatient){ // add new patient reference
	        if(this.nextPatient == null){
		        this.nextPatient = newPatient;
				endPatient = newPatient;
	    	} else {
		    this.nextPatient.addPatient(newPatient);
		    }
	
	    }
	    public boolean deletePatient(Patient patient){
	        if(this.nextPatient == null){
		        //patient to be removed not found
		        return false;
		    } else if (this.nextPatient.name.equals(patient.name)){
		        this.nextPatient = nextPatient.nextPatient;
		        return true;
		    } else {
		        return this.nextPatient.deletePatient(patient);
		    }
	    }
}	
	
	
	