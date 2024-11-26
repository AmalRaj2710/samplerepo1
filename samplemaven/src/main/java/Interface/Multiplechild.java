package Interface;

public class Multiplechild implements Printable,showable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Multiplechild obj=new Multiplechild();
		obj.print();
		obj.show();
		obj.display();
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("this is the show method");
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("this is the print method");
	}
	public void display()
	{
		System.out.println("this is the child");
	}

}
