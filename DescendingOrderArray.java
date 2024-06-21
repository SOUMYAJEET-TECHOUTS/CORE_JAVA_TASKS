package tasktwo;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class DescendingOrderArray {
	
		
		public static void main(String[] args) {
			
			List<Integer> n = new ArrayList<>();
			n.add(1);
			n.add(3);
			n.add(7);
			n.add(9);
			n.add(10);
			n.add(23);
			n.add(4);
			n.add(6);
			System.out.println("Before Sorting Array =" +n);
			
			Collections.sort(n , Collections.reverseOrder());
			System.out.println("After Sorting in Descending Order:" +n);
			 
			
		}

	}


