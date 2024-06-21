package tasktwo;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
public class SynchronizeMapTest {
	

	    public static void main(String[] args) {
	       
	        Map<String, Integer> hashMap = new HashMap<>();

	        
	        Map<String, Integer> synchronizedmap = Collections.synchronizedMap(hashMap);

	       
	        synchronizedmap.put("A", 1);
	        synchronizedmap.put("B", 2);
	        synchronizedmap.put("C", 3);

	        System.out.println("Initial synchronizedMap: " + synchronizedmap);

	        synchronizedmap.put("B", 22);

	        synchronizedmap.remove("C");

	        System.out.print("Updated synchronizedMap: ");
	        for (Map.Entry<String, Integer> entry : synchronizedmap.entrySet()) {
	            System.out.print(entry.getKey() + "=" + entry.getValue() + " ");
	        }
	     
	    }
	}

