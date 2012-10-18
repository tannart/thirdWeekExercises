public class PatientTest{
	
    public static void main(String[] args){
	
	    Patient patientListBegin = null;
		Patient patientListEnd = null;
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
		patientListEnd = tenthPatient;
		patientListEnd.addPatient(ninthPatient);
		patientListEnd.addPatient(eighthPatient);
		patientListEnd.addPatient(seventhPatient);
		patientListEnd.addPatient(sixthPatient);
		patientListEnd.addPatient(fifthPatient);
		patientListEnd.addPatient(fourthPatient);
		patientListEnd.addPatient(thirdPatient);
		patientListEnd.addPatient(secondPatient);
		patientListEnd.addPatient(firstPatient);
		
		patientListBegin.deletePatient(fourthPatient);	
		patientListBegin.deletePatient(eighthPatient);
		
		Patient pos = patientListBegin;
		System.out.println(pos.getName());
	    System.out.println(pos.getIllness());
		System.out.println(pos.getAge());
		System.out.println("");
		
		Patient pos2 = patientListEnd;
		System.out.println(pos2.getName());
	    System.out.println(pos2.getIllness());
		System.out.println(pos2.getAge());
		System.out.println("");
		
        while(pos.getNextPatient() != null){
		    System.out.println(pos.getNextPatient().getName());
		    System.out.println(pos.getNextPatient().getIllness());
		    System.out.println(pos.getNextPatient().getAge());
		    System.out.println("  ");
		    pos=pos.getNextPatient();
	    }
	    while(!pos.getPrevPatient().getName().equals("John")){
			System.out.println(pos.getPrevPatient().getName());
			System.out.println(pos.getPrevPatient().getIllness());
			System.out.println(pos.getPrevPatient().getAge());
			System.out.println("  ");
			pos=pos.getPrevPatient();
		}
	}
}	