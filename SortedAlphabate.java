package tasktwo;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
public class SortedAlphabate {
        public static void main(String[] args) {
        	
        	List<String> str = new ArrayList<>();
        	str.add("Hyderabad");
        	str.add("Odisha");
        	str.add("Mumbai");
        	str.add("Banglore");
        	str.add("Ahemedabad");
        	str.add("Delhi");
        	str.add("Punjab");
        	
        	System.out.println("Before Sorted Lists Are:-" +str);
        	
        	Collections.sort(str);
        	System.out.println("After Sorted Lists Are:-" +str);
        }
}
