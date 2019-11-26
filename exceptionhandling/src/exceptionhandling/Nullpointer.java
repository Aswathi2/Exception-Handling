package exceptionhandling;
import java.util.Scanner;
public class Nullpointer {

	public static void main(String[] args) {
	
		//NULL POINTER EXCEPTION
		//try block throw exception
		try {
			String str=null;
			int d=str.length();
			System.out.print(d);
		}
		//catch block will catch the exception thrown by try block
		catch(Exception e)
		{
			//printing exception value
			System.out.println(e+"\nchecking length of null string");
		}
	}
}
