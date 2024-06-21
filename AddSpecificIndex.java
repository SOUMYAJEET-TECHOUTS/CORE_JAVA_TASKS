package tasktwo;
import java.util.ArrayList;
import java.util.List;
public class AddSpecificIndex {
	
	public static void main(String[] args) {
		
		List<String> li = new ArrayList<>();
		li.add("Dog");
		li.add("Bird");
		li.add("Tiger");
		li.add("Lion");
		
		System.out.println(li);
		
		li.add(2,"Snake");
		System.out.println("New Element after adding at index 2:-" +li);
		
		
	}

}
