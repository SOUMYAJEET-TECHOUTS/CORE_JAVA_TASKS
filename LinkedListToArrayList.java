package tasktwo;
import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
public class LinkedListToArrayList {
            public static void main(String[] args) {
            	List<String> ll = new LinkedList<>();
            	ll.add("orange");
        		ll.add("Banana");
        		ll.add("Potato");
        		ll.add("Lichy");
        		
        		System.out.println("Our LinkedLIst=" +ll);
        		
        		List<String> al = new ArrayList<>(ll);
        		System.out.println("Converted Linkedlist to ArrayList=" +al);
            }
}
