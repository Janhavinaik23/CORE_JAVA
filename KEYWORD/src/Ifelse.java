

import java.util.Scanner;

public class Ifelse {
	 public static void main(String[] args) 
	    {
	        Scanner sc = new Scanner(System.in);
	         
	        System.out.println("Enter a string :");
	         
	        String input = sc.next();
	         
	        if(input.equalsIgnoreCase("JAVA"))
	        {
	            System.out.println("It's JAVA");
	        }
	        else
	        {
	            System.out.println("It's not JAVA");
	        }
	    }
}
