package tasktwo;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


 class Employee
{
	private String name;
    private int id;
    private String address;
    
    public Employee(String name, int id, String address)
    {
    	this.name = name;
    	this.id = id;
    	this.address = address;
    }
    
    public String getName() {
    return name;
    }
    public int getId() {
        return id;
        }
    public String getAddress() {
        return address;
        }
}

 class InvalidEmployeeIdException extends Exception
{
	public  InvalidEmployeeIdException(String message) {
		super(message);
	}
}


public class ExceptionTest {
	
	private static List<Employee> emp = new ArrayList<>();
	
	public static void main(String[] args)
	{
		emp.add(new Employee("Soumyajeet" , 1001 , "Odisha"));
		emp.add(new Employee("Shivam" , 1002 , "Nagpur"));
		emp.add(new Employee("Deepak" , 1003 , "Hyderabad"));
		emp.add(new Employee("Supriya" , 1004 , "Mumbai"));
		emp.add(new Employee("Sachin" , 1005 , "Dehli"));
		
		Scanner ref = new Scanner(System.in);
		System.out.println("Enter Your Employee ID");
		int id = ref.nextInt();
		
		try {
			Office(id);
			System.out.println("Welcome to Office");
		}
		catch(InvalidEmployeeIdException e)
		{
			System.out.println(e.getMessage());
		}
	}
	public static void Office(int id)  throws InvalidEmployeeIdException
	{
		boolean ValidEmployee = false;
		for(Employee emp : emp) {
			if(emp.getId()==id) {
				ValidEmployee =true;
				
			}
		}
		
		if(!ValidEmployee) {
			throw new InvalidEmployeeIdException("Invalid Emplooye Id" + "  " + id  + "  " + "Employee Id Not Found");
		}
	}
        
}
