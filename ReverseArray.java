package tasktwo;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
public class ReverseArray {
     public static void main(String[] args) {
    	 List<String> l = new ArrayList<>();
    	 l.add("Orange");
 		l.add("Banana");
 		l.add("Potato");
 		l.add("Tomato");
 		System.out.println("Original Array:" +l);
 		
 		reverseArrayList(l); 
 		System.out.println("Reverse Array List=" +l);
    	 
     }
     
     public static void reverseArrayList(List<String> l) {
    	 int left = 0;
    	 int right = l.size() -1;
    	 while(left<right)
    	 {
    		 Collections.swap(l , left , right);
    		 left ++;
    		 right --;
    	 }
     }
}
