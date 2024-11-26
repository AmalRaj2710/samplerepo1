package Assignment7;

public class Thisreverse {
int num;
String s;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thisreverse obj =new Thisreverse(128);
	}
	public Thisreverse(int num)
	{
		this("find reverse of number= "+num );
		this.num=num;
		int rev=0;
		while(num!=0)
		{
			int digit=num%10;
			rev=rev*10+digit;
			num=num/10;
		}
		System.out.println("reverse of number= "+rev);
		
	}
	public Thisreverse(String s)
	{
		System.out.println(s);
	}

}
