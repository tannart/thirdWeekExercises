public class Employee{
    private String name;
	private int iD;
	
	public Employee(String name, int iD){
	    this.name = name;
		this.iD = iD;
	}
	public String setName(String tempName){
		name = tempName;
	}
	public int setID(int tempID){
		iD = tempID;
	}
	
	public void getEmployee(){
	    Employee[] newEmployee = new Employee[10];
        for(int a =0; a < newEmployee.length-1; a++){
        System.out.println("Please enter the name of your first employee: ");
	    System.console().readLine(newEmployee[a].setName);
	    System.out.println("Now please enter their ID number: ");
	    System.console().readLine(newEmployee[a].setID);
	    }
	}
}
