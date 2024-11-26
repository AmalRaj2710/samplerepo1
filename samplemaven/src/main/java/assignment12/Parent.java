package assignment12;

public class Parent {
	private double pin;

	public void setter(double pin)
	{
		this.pin=pin;
	}
	public void getter()
	{
		if(pin==1001 || pin==1234 ||pin==1212)
		{
			System.out.println("valid pin");
		}
		
		else
		{
			System.out.println("not valid pin");
		}
	}
}
