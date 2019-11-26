package exceptionhandling;
import java.util.Scanner;
public class Throw1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner s=new Scanner(System.in);
     System.out.println("enter a number");
     int a=s.nextInt();
     System.out.println("enter a number");
     int b=s.nextInt();
     if(a<b)
    	 throw new ArithmeticException("B IS GREATER");
    	 else
    		 throw new ArithmeticException("B IS GREATER");
	}

}
