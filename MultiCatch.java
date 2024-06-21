package tasktwo;
import java.util.Scanner;
public class MultiCatch {
         public static void main(String[] args)
         {
        	 
        	 int n;
        	 int d;
        	 System.out.println("Enter numerator");
        	 Scanner r = new Scanner(System.in);
        	 n = r.nextInt();
        	 System.out.println("Enter denominator");
        	 Scanner ref = new Scanner(System.in);
        	 d = ref.nextInt();
        	 
        	 try {
        		 int result = divide(n , d);
        		 System.out.println("Result = " +result);
        	 }
        	 catch(ArithmeticException  e)
        	 {
        		 System.out.println("Divide by Zero Not allowed");
        	 }
        	 catch(NumberFormatException t)
        	 {
        		 System.out.println("Enter a Valid Number");
        	 }
        	 catch(Exception p)
        	 {
        		 System.out.println(p.getMessage());
        	 }
        	 
        	 
        	 }
         
                       public static int divide(int n , int d){
	                                    return n / d ;
              
	                                    
               }
               }