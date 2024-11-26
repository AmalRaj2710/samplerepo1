package accessmodifierexample;

public class aceesmodifier1 {

	public static void main(String[] args) {
		 aceesmodifier1 obj=new aceesmodifier1();
		obj.display();
		obj.display1();
		obj.display2();
		obj.display3();
		// TODO Auto-generated method stub

	}
	public void display()
	{
		System.out.println("public modifier");
	}
private void display1()
{
	System.out.println("this is private");
}
protected void display2()
{
	System.out.println("this is protected");
}
void display3()
{
	System.out.println("this is default");
}
}
