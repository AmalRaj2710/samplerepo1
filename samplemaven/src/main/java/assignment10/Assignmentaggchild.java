package assignment10;

public class Assignmentaggchild {
	String city;
String state;
Aggerigationass ref;
	public static void main(String[] args) {
		Aggerigationass obj1=new Aggerigationass("Amal",12);
		Assignmentaggchild obj=new Assignmentaggchild("kollam","kerala",obj1);
		obj.dispaly();
	
	}
	public Assignmentaggchild(String city,String state,Aggerigationass ref)
	{
		this.city=city;
		this.state=state;
		this.ref=ref;
	}
	public void dispaly()
	{
		System.out.println("Address: "+city +"  "+ state);
		System.out.println(ref.name + " "+ref.roll);
	}
}
