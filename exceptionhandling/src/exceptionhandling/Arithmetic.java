package exceptionhandling;
import java.util.Scanner;
public class Arithmetic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("enter the number");
int n=s.nextInt();
//ARITHMETIC EXCEPTION
//try block throw exception
try {
	int d=n/0;
	System.out.print(d);
}
//catch block will catch the exception thrown by try block
catch(Exception e)
{
	//printing exception value
	System.out.println(e);
}

	}

}
