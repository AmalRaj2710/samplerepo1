package samplemavenpackage;

public class Test {
static int secmark=90;
static int regno=108;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  System.out.println(Test.student("amal",23));
		Test obj=new Test(10038,9000);
		obj.car("ferrari");
	}
	public static int student(String name,int firmark)
	{
		System.out.println("Name of student:"+name);
		System.out.println("sem 1 mark:"+firmark);
		System.out.println("sem2 mrk:"+secmark);
		int totalmark=firmark+secmark;
		return totalmark;
	}
	public void car(String carname)
	{
		System.out.println("regmumber"+regno);
		System.out.println("Car Name is"+carname);
	}
	
	public Test(int empid,long salary)
	{
		System.out.println("employe id :"+empid);
		System.out.println("salary of january:"+salary);
	}

}
