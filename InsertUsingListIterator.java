package tasktwo;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class InsertUsingListIterator {
	
	
	    public static void main(String[] args) {
	        
	        List<String> aL = new ArrayList<>();
	        aL.add("Apple");
	        aL.add("Banana");
	        aL.add("Cherry");

	       
	        System.out.println("Original ArrayList: " + aL);

	      
	        ListIterator<String> iterator = aL.listIterator();

	                iterator.add("Orange");
	            
	        
	        System.out.println("ArrayList after insertion: " + aL);
	    }
	}


