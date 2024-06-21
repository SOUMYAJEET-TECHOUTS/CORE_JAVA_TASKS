package tasktwo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


public class SortHashMapByValue {
 
	public static void main(String[] args) {
		
		HashMap<String, Integer> h = new HashMap<String, Integer>();
		h.put("Five", 5);
		h.put("Four", 4);
		h.put("Nine", 9);
		h.put("Seven", 7);
		h.put("Two", 2);
		h.put("Eight", 8);
		h.put("One", 1);
		h.put("Three", 3);
		h.put("Six", 6);
		h.put("Zero", 0);
		
		System.out.println("Unsorted HashMap\n"+h);
		
		Set<Entry<String, Integer>> set = h.entrySet();
		
		System.out.println("HashMap To Set\n"+set);
	
		ArrayList<Entry<String, Integer>> list = new ArrayList<>(set);
	
		System.out.println("Set to ArrayList\n"+list);
		
		Collections.sort(list, new Comparator<Entry<String, Integer>>() {
			@Override
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
				return o1.getValue() - o2.getValue();
			}
		});
		System.out.println("Sorted ArrayList\n"+list);
	
		LinkedHashMap<String, Integer> hM1 = new LinkedHashMap<String, Integer>();
		for (Map.Entry<String, Integer> entry1 : list) {
			hM1.put(entry1.getKey(), entry1.getValue());
		}
		System.out.println("Sorted HashMap\n"+hM1);
	}
 
}