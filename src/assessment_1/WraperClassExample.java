package assessment_1;

public class WraperClassExample {

	public static void main(String[] args) {
		
		//toString()
		Integer myInt = 500;
	    String myString = myInt.toString();
	    System.out.println("toString() example: " +myString.length());

	    //byteValue()
	    Byte b = 2;
	    System.out.println("byteValue() example: " +b.byteValue());
	    
	    //doubleValue()
	    Double d = 20.78;
	    System.out.println("doubleValue() example: " +d.doubleValue());
	    
	    //floatValue()
	    Float f = 5f;
	    System.out.println("floatValue() example: " +f.floatValue());
	    
	    //intValue()
	    Integer i = 10;
	    System.out.println("intValue() example: " +i.intValue());
	    
	    //shortValue()	
	    Short s = 1;
	    System.out.println("shortValue() example: " +s.shortValue());
	    
	    
	    //longValue()
	    Long l = 88l;
	    System.out.println("longValue() example: " +l.longValue());
	
	    //intcompareTo()
	    Integer i1 = 100;
	    Integer i2 = 200;
	    System.out.println("intcompareTo() example: " +i1.compareTo(i2));
	    
	    //boolean equals(Object intObj)
	    Boolean b1 = true;
	    Boolean b2 = false;
	    System.out.println("boolean equals(Object intObj): " +b1.equals(b2));
	}

}
