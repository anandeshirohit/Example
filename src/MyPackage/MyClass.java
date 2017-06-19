package MyPackage;

import java.util.ArrayList;

public class MyClass {


			
			public static void main(String[] args) {
				
				ArrayList<Employee> emp=new ArrayList<Employee>(); 	
				for (int i=0; i <= 100; i++) {
					String name="emp" + i;
					int id= i;
					double sal = i+100;
					Employee employees = new Employee(name,id,sal);
					emp.add(employees);
				}
				
				for (int i=0;i<emp.size();i++) {
					Employee employees = (Employee) emp.get(i);
					System.out.println("Employee" + i +  " name is =" + employees.getEmpName());
					System.out.println("Employee" + i +  " id is =" + employees.getEmpId());
					System.out.println("Employee" + i +  " sal is =" + employees.getSalary());
				    } 
				
			
			
			}

		

	}



