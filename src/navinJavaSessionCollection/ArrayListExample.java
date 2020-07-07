package navinJavaSessionCollection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {

	public static void main(String[] args) {

		//int a[] = new int[3]; // normal array with fixed sizes
		
		//ArrayList is dynamic array
		//it contain duplicate value
		//maintain insertion order
		//not synchronized 
		//allow to random access to fetch element because it stores the element on the bases of index
		
		ArrayList ar = new ArrayList(); // non-generic arraylist
		ar.add(10);
		ar.add(20);
		ar.add(30);
		
		System.out.println(ar.size()); //get size
		System.out.println("-----------------------------");
		
		ar.add(40);
		ar.add(50);
		ar.add(50);
		
		System.out.println(ar.size()); //get size
		System.out.println(ar.get(1)); //get value of an index
		System.out.println("-----------------------------");
		
		//print arraylist using for loop
		for(int i=0; i<ar.size(); i++) {
			System.out.println(ar.get(i));
		}
		System.out.println("-----------------------------");
		
		//print arraylist using iterator
		Iterator itr = ar.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("-----------------------------");
		
		
		ArrayList<Integer> ar1 = new ArrayList<Integer>(); //generic arraylist
		ar1.add(100);
		ar1.add(200);
		ar1.add(300);
		
		Iterator<Integer> itr1 = ar1.iterator();
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}
		System.out.println("-----------------------------");
		
		ArrayList<String> ar2 = new ArrayList<String>(); //generic arraylist
		ar2.add("AAA");
		ar2.add("BBB");
		ar2.add("CCC");
		
		ArrayList<String> ar3 = new ArrayList<String>(); //generic arraylist
		ar3.add("DDD");
		ar3.add("EEE");
		ar3.add("FFF");
		ar3.addAll(ar2); // addAll() - add ar2 list in ar3
		
		Iterator<String> itr3 = ar3.iterator();
		while(itr3.hasNext()) {
			System.out.println(itr3.next());
		}
		System.out.println("-----------------------------");
		
		ar3.removeAll(ar2); //removeAll() - remove ar2 list in ar3
		
		Iterator<String> itr4 = ar3.iterator();
		while(itr4.hasNext()) {
			System.out.println(itr4.next());
		}
		System.out.println("-----------------------------");
		
		
		
	}

	
}
