package navinJavaSessionCollection;

import java.util.ArrayList;
import java.util.Iterator;

public class EmpTest {

	public static void main(String[] args) {
		
		Employee e1 = new Employee("Vicky", 26, "AutoMatio QA");
		Employee e2 = new Employee("Mayuri", 23, "DA");
		Employee e3 = new Employee("Tom", 25, "Dev");

		ArrayList<Employee> ar = new ArrayList<Employee>();
		ar.add(e1);
		ar.add(e2);
		ar.add(e3);
		
		Iterator<Employee> itr = ar.iterator();
		while(itr.hasNext()) {
			Employee emp = itr.next();
			System.out.println(emp.name);
			System.out.println(emp.age);
			System.out.println(emp.dept);
		}
		
	}

}
