package polymorphism;

public class Polychild extends Polyparent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Polychild obj=new Polychild();
		obj.display(4, 6);
	}
	public void display(int n1,int n2)
	{
		//super.display(5, 9);
		int c=n1+n2;
		System.out.println("sum "+c);
	}

}
