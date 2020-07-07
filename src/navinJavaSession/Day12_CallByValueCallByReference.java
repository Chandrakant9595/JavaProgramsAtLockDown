package navinJavaSession;

public class Day12_CallByValueCallByReference {

	int p;
	int q;
	
	public int sum(int a, int b) {
		int c = a+b;
		return c;
	}
	
	public void swap(Day12_CallByValueCallByReference d) {
		int temp;
		temp = d.p;
		d.p = d.q;
		d.q = temp;
	}
	
	public static void main(String[] args) {
		
		Day12_CallByValueCallByReference d12 = new Day12_CallByValueCallByReference();
		
		int x = 10;
		int y = 20;
		d12.sum(x, y); // call by value
		
		
		d12.p = 30;
		d12.q = 40;
		
		d12.swap(d12); //call by reference 
		System.out.println("p: " +d12.p);
		System.out.println("q: " +d12.q);
	}

}
