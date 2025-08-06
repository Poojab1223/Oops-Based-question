package promotion;

import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		Employee[] employees = new Employee[5];

		// Create 5 employee objects using the constructor
		employees[0] = new Employee(101, "Pooja", "Developer", 25000, DESIGNATIONLEVEL.JUNIOR);
		employees[1] = new Employee(102, "Rahul", "Developer", 30000, DESIGNATIONLEVEL.MID);
		employees[2] = new Employee(103, "Sneha", "Tester", 40000, DESIGNATIONLEVEL.SENIOR);
		employees[3] = new Employee(104, "Amit", "Support Engineer", 22000, DESIGNATIONLEVEL.JUNIOR);
		employees[4] = new Employee(105, "Meera", "Project Manager", 50000, DESIGNATIONLEVEL.LEAD);

		System.out.println("enter the id of an employee whom you want to give the promotion");
		Scanner sc=new Scanner(System.in);
		int id=sc.nextInt();
		int flag=0;
		for(int i=0;i<employees.length;i++) {
			if(id==employees[i].id) {
				flag=1;
				System.out.println("before promotion");
				System.out.println(employees[i]);
				
				
				DESIGNATIONLEVEL[] levels = DESIGNATIONLEVEL.values();
				int index = employees[i].level.ordinal();
				DESIGNATIONLEVEL nextPromotion = levels[index + 1]; 
				employees[i].level=nextPromotion;
				employees[i].salary=employees[i].salary+5000;
				
				System.out.println();
				
				System.out.println("-----------------------------");
				
				System.out.println("after promotion");
				System.out.println(employees[i]);

			}

		}
		if(flag==0) {
			System.out.println("Id not found");
		}




	}

}
