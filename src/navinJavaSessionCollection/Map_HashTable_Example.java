 package navinJavaSessionCollection;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Set;

public class Map_HashTable_Example {

	public static void main(String[] args) {
		
		// It is similar to HashMap
		// It is synchronized 
		// used key-value format to store value
		// key-->Object--HashCode-->value (HashCode - object having unique identy number)
		// if key and value added multiple times then at the time of print ignored one
		
		//generic HashTable
		Hashtable<String, String> hh1 = new Hashtable<String, String>();
		hh1.put("A", "SSS");
		
		//generic HashTable
		Hashtable<Integer, String> hh2 = new Hashtable<Integer, String>();
		hh2.put(1, "SSS");
		
		//generic HashTable
		Hashtable<Integer, Integer> hh3 = new Hashtable<Integer, Integer>();
		hh3.put(1, 100);
		
		Hashtable ht1 = new Hashtable();
		ht1.put(1, "AAA");
		ht1.put(2, "BBB");
		ht1.put(3, "CCC");
		
		// get value of 
		System.out.println(ht1.get(2));
		System.out.println(ht1); // print
		System.out.println("---------------------------");
		
		//create close copy
		Hashtable ht2 = new Hashtable();
		
		ht2 = (Hashtable) ht1.clone();
		System.out.println(ht2); //pint 
		System.out.println("---------------------------");
		
		
		//delte all value form ht1
		ht1.clear();
		System.out.println(ht1); // print
		System.out.println(ht2); //pint 
		System.out.println("---------------------------");
		
		
		
		Hashtable ht3 = new Hashtable();
		ht3.put(1, "XXX");
		ht3.put(2, "YYY");
		ht3.put(3, "ZZZ");
		
		//contains value 
		if(ht3.containsValue("XXX")){
			System.out.println("found");
		}else {
			System.out.println("Not found");
		}
		System.out.println("---------------------------");
		
		
		// print all value iterate using Enumeration 
		Enumeration e = ht3.elements();
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
		System.out.println("---------------------------");
		
		// print all value iterate using entrySet() 
		Set s = ht3.entrySet();
		System.out.println(s);
		System.out.println("---------------------------");
		
		
		
		Hashtable ht4 = new Hashtable();
		ht4.put(1, "XXX");
		ht4.put(2, "YYY");
		ht4.put(3, "ZZZ");
		
		//check hashtable equal or not
		if(ht3.equals(ht4)) {
			System.out.println("ht3 and ht4 hashtable are same");
		}else {
			System.out.println("ht3 and ht4 hashtable are not same");
		}
		
		System.out.println("---------------------------");
		
		//get the value from a key
		System.out.println(ht4.get(2));
		System.out.println("---------------------------");
		
		//get the hash code
		System.out.println("Hash code value: " +ht4.hashCode());
		System.out.println("---------------------------");
		
		
		
	}

}
