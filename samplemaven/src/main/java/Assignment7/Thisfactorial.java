package Assignment7;

public class Thisfactorial {
int num;
int fact;
	public static void main(String[] args) {
		Thisfactorial obj=new Thisfactorial();
		obj.factorial(6);
		
	}
	public void factorial(int num)
	{
		this.num=num;
		fact=1;
		for(int i=1;i<=num;i++)
		{
			fact*=i;
		}
		this.display();
		
	}
public void display()
{
	System.out.println("factorial of  "+ num +" is  " +fact );
}
}
