package superkeyword;

public class Supervariablechild extends Supervariableex1 {
String colour="red";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Supervariablechild obj=new Supervariablechild();
		obj.display();
		
	}
	
	public void display()
	{
		System.out.println(colour);
		System.out.println(super.colour);
	}
}
