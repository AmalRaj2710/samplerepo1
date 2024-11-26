package aggergation;

public class Aggerchild {
	int rollno;
	String city;
	Aggreparent refvar;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aggreparent obj=new Aggreparent("amal",23);
		Aggerchild obj1=new Aggerchild(16,"kollam",obj);
		obj1.display();
		
	}
	public Aggerchild(int rollno,String city, Aggreparent refvar)
	{
	
		this.rollno=rollno;
		this.city=city;
		this.refvar=refvar;
	}
	public void display()
	{
		System.out.println(rollno+city);
	System.out.println(refvar.name+refvar.age);
	}

}
