package exceptionhandling;

public class Customexception {

	public static void main(String[] args)throws VotingException {
		int age=11;
		if(age>18)
		{
			System.out.println("eligible for voting");
		}
		else
		{
			throw new VotingException("not eligible for voting");
		}

	}

}
