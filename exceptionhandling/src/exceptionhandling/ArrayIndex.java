package exceptionhandling;
public class ArrayIndex {

	public static void main(String[] args) {
	
		//ARRAY INDEXOUT OF BOUND EXCEPTION
		//try block throw exception
		try {
			int a[]= {1,2,3,4};
			a[9]=2;
		}
		//catch block will catch the exception thrown by try block
		catch(Exception e)
		{
			//printing exception value
			System.out.println(e);
		}
	}
}
