package assessment_1;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveOddNumberFromArrayList {

	public static void main(String[] args) {
	
		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 11,
				12, 13, 14, 15));

        for (int i = 0; i < list.size(); i++) {
            list.remove(i);
        }
        System.out.println(list);
	}
}
