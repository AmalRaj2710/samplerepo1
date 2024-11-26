package superkeyword;

public class Superchildmethod extends Superparentmethod{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Superchildmethod obj=new Superchildmethod();
		obj.show();
	}
public void show()
{
	super.display();
	System.out.println("this is the child class");
}
}
