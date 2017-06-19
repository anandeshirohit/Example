package MyPackage;

public class Employee {


	 private String empName;
	 private int empId;
	 private double empSal;
	 Employee employees[] = new Employee[100];
		 
		 public Employee(String empName,int empId,double empSal){
	         this.empName=empName;
	         this.empId=empId; 
	         this.empSal=empSal;
	      }
		 
		 public String getEmpName(){
			 return empName;
		 }
		
		 public int getEmpId(){
		     return empId;
		 }
		 
		  public double getSalary(){
		     return empSal;
		 }
		 
}
		

