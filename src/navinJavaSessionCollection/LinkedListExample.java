package navinJavaSessionCollection;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {

		LinkedList<String> ll = new LinkedList<String>();
		
		ll.add("AAA"); //add data
		ll.add("BBB");
		ll.add("CCC");
		
		System.out.println(ll); //print
		System.out.println(ll.size()); // get size
		System.out.println("-------------------");
		
		ll.addFirst("ZZZ"); //add first 
		ll.addLast("DDD"); //add last
		
		System.out.println(ll); //print
		System.out.println(ll.size()); // get size
		System.out.println("-------------------");
		
		System.out.println(ll.get(1)); //get 1index data
		System.out.println(ll.get(2)); //get 2index data
		System.out.println(ll.getFirst()); //get first index data
		System.out.println(ll.getLast()); //get second index data
		System.out.println("-------------------");
		
		ll.set(0, "Vicky"); //update data
		System.out.println(ll); //print
		System.out.println("-------------------");
		
		ll.remove(1); //remove data
		ll.removeFirst(); //remove first
		ll.removeLast(); //remove last
		System.out.println(ll); //print
		System.out.println("-------------------");
		
	
		
		
		
		
		//print all values using for loop, advance for loop, iterator, while loop 
		
		LinkedList<String> ll1 = new LinkedList<String>();
		ll1.add("Vicky");
		ll1.add("Mahi");
		ll1.add("Pravin");
		ll1.add("piyush");
		ll1.add("Guddi");
		System.out.println(ll1); //print
		System.out.println("-------------------");
		
		// print using for loop
		System.out.println("get data using for loop");
		for(int i=0; i<ll1.size(); i++) {
			System.out.println(ll1.get(i));
		}
		System.out.println("-------------------");
		
		//print using advance for loop
		System.out.println("get data using advance for loop");
		for(String str : ll1) {
			System.out.println(str);
		}
		System.out.println("-------------------");
		
		
		//print data using iterator
		System.out.println("get data using iterator");
		Iterator<String> itr = ll1.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("-------------------");
		
		//using while loop
		System.out.println("get data using while loop");
		int num=0;
		while(ll1.size()>num) {
			System.out.println(ll1.get(num));
			num++;
		}
		System.out.println("-------------------");
	}
}
