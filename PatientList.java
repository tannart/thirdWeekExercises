public class PatientList{

	
	public static void main(String[] args){
	    Patient patientListBegin;
		
	
	    Patient firstPatient = new Patient("John", 33, "Tuberculosis");
		Patient secondPatient = new Patient("Derek", 45,"Consumption");
		Patient thirdPatient = new Patient("Jill", 19, "Plague");
		Patient fourthPatient = new Patient("Boris", 14,"Smallpox");
		Patient fifthPatient = new Patient("Mark", 52, "Quinsy");
		Patient sixthPatient = new Patient("Charlotte", 23,"Malaria");
		Patient seventhPatient = new Patient("Pippa", 65, "Sickle-celled Anaemia");
		Patient eighthPatient = new Patient("Susan", 35,"Herpes");
		Patient ninthPatient = new Patient("Roger", 77, "Violetta");
		Patient tenthPatient = new Patient("Betty", 53,"Turpett");
		
		patientListBegin = firstPatient;
		patientListBegin.addPatient(secondPatient);
		patientListBegin.addPatient(thirdPatient);
		patientListBegin.addPatient(fourthPatient);
		patientListBegin.addPatient(fifthPatient);
		patientListBegin.addPatient(sixthPatient);
		patientListBegin.addPatient(seventhPatient);
		patientListBegin.addPatient(eighthPatient);
		patientListBegin.addPatient(ninthPatient);
		patientListBegin.addPatient(tenthPatient);
		
		for(Patient pos = patientListBegin; pos.getNext()!= null; pos = pos.getNext()){
		    System.out.println(pos.getName());
			System.out.println(pos.getIllness());
			System.out.println(pos.getAge());
			System.out.println("");
		}
    }
}