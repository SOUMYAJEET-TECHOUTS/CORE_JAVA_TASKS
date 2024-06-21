package tasktwo;
import java.util.ArrayList;
import java.util.List;


public class ReplaceElements {
	
		public static void main(String[] args) {
			
			List<String> li = new ArrayList<>();
			li.add("Dog");
			li.add("Bird");
			li.add("Tiger");
			li.add("Lion");
			
			System.out.println("Before Replacing Element Array=" +li);
			
			int indexToReplace = 1;
			String newel = "Snake";
			li.set(indexToReplace, newel);
			System.out.println("After Replcing Element ArrayList:-" +li);
			
			
		}

	}


