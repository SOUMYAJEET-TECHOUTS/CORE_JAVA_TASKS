package tasktwo;
import java.util.List;
import java.util.ArrayList;
public class RemoveDuplicates {
	
	public static void main(String[] args) {
		List<String> str = new ArrayList<>();
		str.add("orange");
		str.add("Banana");
		str.add("Potato");
		str.add("Potato");
		str.add("Carrot");
		str.add("Banana");
		str.add("orange");
		str.add("Lichy");
		System.out.println("Our ArrayLIst=" +str);
		
		removeDuplicates(str);
		
		System.out.println("Our ArrayLIst=" +str);
	}
	
	public static void removeDuplicates(List<String> str) {
		for(int i = 0; i<str.size(); i++) {
			String current = str.get(i);
			for(int j=i+1;j<str.size();j++) {
				if(current.equals(str.get(j))) {;
				str.remove(j);
				
				
			}
		}
	}

}
}
