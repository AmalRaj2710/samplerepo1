package exceptionhandling;

public class Throwex1 {

	public static void main(String[] args) {
		int age=11;
		if(age>18)
		{
			System.out.println("eligible for voting");
		}
		else
		{
			throw new ArithmeticException("not eligible for voting");
		}
	}

}
