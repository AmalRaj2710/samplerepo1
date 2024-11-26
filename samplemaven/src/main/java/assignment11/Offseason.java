package assignment11;

public class Offseason extends Onseason 
{
	public static void main(String[] args)
	{
		Offseason obj=new Offseason();
		obj.discount(10000);
	}
	public void discount(long amount)
	{
		super.discount(6000);
		double discount=amount*.15;
		System.out.println("Discount of amount in offseason: " +discount);
	}
}
