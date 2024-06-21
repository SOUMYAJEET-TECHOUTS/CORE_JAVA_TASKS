package tasktwo;
import java.util.HashSet;
import java.util.Arrays;
public class HashsetToArray {
	

	    public static void main(String[] args) {
	       
	        HashSet<String> hs = new HashSet<>();
	        hs.add("Apple");
	        hs.add("Banana");
	        hs.add("Cherry");

	        
	        System.out.println("Original HashSet: " + hs);

	     
	        String[] array = new String[hs.size()];
	        hs.toArray(array);

	       
	        System.out.println("Converted Array: " + Arrays.toString(array));
	    }
	}


