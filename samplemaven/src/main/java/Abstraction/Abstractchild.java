package Abstraction;

public class Abstractchild extends Abstractparent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Abstractchild obj=new Abstractchild();
		obj.add();
		obj.display();
		obj.show();
	}

	@Override
	public void add() {
		// TODO Auto-generated method stub
		int s=1+3;
		System.out.println("sum = "+s);
	}
	public void show()
	{
		System.out.println("child class");
	}

}
