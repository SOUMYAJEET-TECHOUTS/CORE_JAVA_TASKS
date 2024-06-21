package tasktwo;
import java.util.List;
import java.util.ArrayList;

public class RemoveElementArray {
         public static void main(String[] args) {
        	 List<Integer> list = new ArrayList<>();
        	 
        	 list.add(190);
        	 list.add(43);
        	 list.add(93);
        	 list.add(87);
        	 list.add(100);
        	 list.add(172);
        	 System.out.println("Our ArrayLIst=" +list);
        	 
        	 list.remove(2);
        	 System.out.println("After Removing Our ArrayLIst=" +list);
         }
}
