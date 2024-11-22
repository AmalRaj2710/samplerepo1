package Abstraction;

public class Abstractex1child extends Abstractexg2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Abstractexg2 obj=new Abstractex1child();//referance variable
		obj.display();
		obj.show();
	//	obj.display1();
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("abstract method");
	}
	public void display1()
	{
		System.out.println("this is the child");
	}

}
