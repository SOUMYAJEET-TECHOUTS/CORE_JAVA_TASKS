package tasktwo;
import java.util.TreeMap;
import java.util.Map;
public class IterateTreeMap {
         public static void main(String[] args) {
        	 Map<Integer, String> t = new TreeMap<>();
        	 t.put(1, "One");
        	 t.put(2, "Two");
        	 t.put(3, "Three");
        	 t.put(4, "Four");
        	 System.out.println("Original TreeMap=" + t);
        	 System.out.println("Iterating Over TreeMap");
        	 
        	 for(Map.Entry<Integer,String> entry: t.entrySet()) {
        		 String value = entry.getValue();
        		 Integer key = entry.getKey();
        		 System.out.println("Key: " + key + ", Value: " + value);
             }
        	 }
         }

