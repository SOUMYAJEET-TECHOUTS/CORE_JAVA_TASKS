package tasktwo;
import java.io.*;
import java.util.HashMap;
public class SerializeHashmap {
	


	    public static void main(String[] args) {
	     
	        HashMap<String, Integer> hashMap = new HashMap<>();
	        hashMap.put("Apple", 50);
	        hashMap.put("Banana", 20);
	        hashMap.put("Cherry", 30);
	        hashMap.put("Date", 40);

	      
	        serializeHashMap(hashMap, "hashMap.ser");

	        System.out.println("HashMap serialized successfully.");
	    }

	    public static void serializeHashMap(HashMap<String, Integer> hashMap, String fileName) {
	        try (FileOutputStream fos = new FileOutputStream(fileName);
	             ObjectOutputStream oos = new ObjectOutputStream(fos)) {

	            
	            oos.writeObject(hashMap);

	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
	}


