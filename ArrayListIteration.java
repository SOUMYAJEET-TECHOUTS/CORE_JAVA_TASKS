package tasktwo;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
public class ArrayListIteration {
	

	    public static void main(String[] args) {
	        
	        List<String> arrayList = new ArrayList<>();
	        arrayList.add("Apple");
	        arrayList.add("Guava");
	        arrayList.add("Cherry");

	      
	        ListIterator<String> iterator = arrayList.listIterator();

	       
	        System.out.println("Iterating forward:");
	        while (iterator.hasNext()) {
	            String element = iterator.next();
	            System.out.println(element);
	        }

	     
	        System.out.println("\nIterating backward:");
	        while (iterator.hasPrevious()) {
	            String element = iterator.previous();
	            System.out.println(element);
	        }
	    }
	}


