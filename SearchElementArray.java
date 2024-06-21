package tasktwo;
import java.util.ArrayList;
import java.util.List;


public class SearchElementArray {
	
		public static void main(String[] args) {
			
			List<String> li = new ArrayList<>();
			li.add("Dog");
			li.add("Bird");
			li.add("Tiger");
			li.add("Lion");
			
			System.out.println("Our ArrayLIst=" +li);
			
			String elementToSearch = "LIon";
			boolean found = li.contains(elementToSearch);
			
			if(found)
			{
				System.out.println("Searched Element is=" +elementToSearch);
			}
			else
			{
				System.out.println("Element not In List:" +elementToSearch);
			}



		}
}
