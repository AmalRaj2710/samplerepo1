package exceptionhandling;

public class Exceptionex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=30;
		int b=0;
		try
        {
		int c=a/b;
		}
		catch(ArithmeticException ae )
		{
			b=6;
			int d=a/b;
			System.out.println(d);
			System.out.println(ae);
		}
	}
 
	}


