package inheritanceexaple;

public class heirarchialchild1 extends Heirarchialparent{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		heirarchialchild1 obj=new heirarchialchild1();
		obj.display();
		obj.display1();

	}
public static void display1() {
	System.out.println("this is child one");
}
}
