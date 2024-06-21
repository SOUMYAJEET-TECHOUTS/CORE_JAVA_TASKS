package tasktwo;
import java.io.*;
import java.util.ArrayList;

public class ArraySerialize {
	


	    public static void main(String[] args) {
	      
	        ArrayList<String> al = new ArrayList<>();
	        al.add("Apple");
	        al.add("Banana");
	        al.add("Cherry");

	     
	        serializeArrayList(al, "arrayList.ser");

	        System.out.println("ArrayList serialized successfully.");
	    }

	    public static void serializeArrayList(ArrayList<String> arrayList, String fileName) {
	        try (FileOutputStream fos = new FileOutputStream(fileName);
	             ObjectOutputStream oos = new ObjectOutputStream(fos)) {

	            
	            oos.writeObject(arrayList);

	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
	}


