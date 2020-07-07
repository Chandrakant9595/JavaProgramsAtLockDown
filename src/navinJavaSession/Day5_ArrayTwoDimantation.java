package navinJavaSession;

public class Day5_ArrayTwoDimantation {

	public static void main(String[] args) {
		
		String x[][] = new String[3][5];
		
		System.out.println(x.length); //return row count
		System.out.println(x[0].length); //return column count
		
		//1st row
		x[0][0] = "A";
		x[0][1] = "B";
		x[0][2] = "C";
		x[0][3] = "D";
		x[0][4] = "E";
		
		//2nd row
		x[1][0] = "A1";
		x[1][1] = "B1";
		x[1][2] = "C1";
		x[1][3] = "D1";
		x[1][4] = "E1";
		
		//3rd row
		x[2][0] = "A2";
		x[2][1] = "B2";
		x[2][2] = "C2";
		x[2][3] = "D2";
		x[2][4] = "E2";
		
		//to get specfic value
		System.out.println(x[1][3]);
		System.out.println("----------");
		
		// print all values of 2D array
		for(int row=0; row<x.length; row++) {
			for(int col=0; col<x[0].length; col++) {
				System.out.println(x[row][col]);
			}
		}
		
		System.out.println("----------");
		
		
		//Object 2D array
		Object ob[][] = new Object[2][3];
		
		ob[0][0] = 1;
		ob[0][1] = "Vicky";
		ob[0][2] = 'M';
		
		ob[1][0] = 2;
		ob[1][1] = "Mayuri";
		ob[1][2] = 'F';
		
		for(int row=0; row<ob.length; row++) {
			for(int col=0; col<ob[0].length; col++) {
				System.out.println(ob[row][col]);
			}
		}
	}
}
