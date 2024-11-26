package assignment6;

public class Student1 {
  int mathsmark;
 int sciencemark;
 int englishmark;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student1 obj=new Student1("Amal raj",99,94,92);
		obj.display();
	}
	public Student1(String name,int mathsmark,int sciencemark,int englishmark)
	{
		System.out.println("name of student: "+name);
		System.out.println("maths mark= "+mathsmark);
		System.out.println("science mark= "+sciencemark);
		System.out.println("english mark= "+englishmark);
	}
	public int caltotalmark()
	{
		return mathsmark+sciencemark+englishmark;
	}
	public String findgrade(int totalmark)
	{
		if(totalmark>=270)
		{
			return "A";
		}
		else if(totalmark>=240)
		{
			return "B";
		}
		else if(totalmark>=200)
		{
			return "C";
		}
		else
		{
			return "D";
		}
	}
	public void display()
	{
		int totalmark=caltotalmark();
		System.out.println("total mark= "+totalmark);
		String grade=findgrade(totalmark);
		System.out.println("grade of student: "+grade);
	}

}
