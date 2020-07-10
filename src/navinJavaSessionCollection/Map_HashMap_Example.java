package navinJavaSessionCollection;

import java.util.HashMap;
import java.util.Map.Entry;

public class Map_HashMap_Example {

	public static void main(String[] args) {
		
		// HashMap  is a class implements Map interface
		// HasMap contain unique elements
		// HasMap store value key-value pair 
		// HasMap can allowed one null key and multiple null values
		// HasMap it maintain no order
		// HashMap is non synchronized 
		
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(1, "AAA");
		hm.put(2, "BBB");
		hm.put(3, "CCC");
		hm.put(4, "DDD");
		
		//get the specific key value
		System.out.println(hm.get(2));
		System.out.println("----------------------------");
		
		//print all values / Iterate 
		for(Entry m : hm.entrySet()) {
			System.out.println(m.getKey() +" "+ m.getValue());
		}
		
		System.out.println("----------------------------");
		 
		//remove element
		hm.remove(4);
		
		for(Entry m : hm.entrySet()) {
			System.out.println(m.getKey() +" "+ m.getValue());
		}
		System.out.println("----------------------------");
		
		
		
		//take Employee.java info
		HashMap<Integer, Employee> emp = new HashMap<Integer, Employee>();
		
		Employee e1 = new Employee("Vicky", 26, "QA");
		Employee e2 = new Employee("Mayuri", 24, "DA");
		Employee e3 = new Employee("kajal", 23, "BA");
		
		emp.put(1, e1);
		emp.put(2, e2);
		emp.put(3, e3);
		
		for(Entry<Integer, Employee> m : emp.entrySet()) {
			int key = m.getKey();
			Employee e = m.getValue();
			System.out.println("Employee "+ key + " Info");
			System.out.println(e.name +" "+ e.age +" "+ e.dept);
		}
		
	}

}
