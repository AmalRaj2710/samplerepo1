package assignment6;

public class Student {
String name;
int mathsmark;
int sciencemark;
int englishmark;
	public static void main(String[] args) {
		Student obj1=new Student("Amalraj",90 ,80,88);
		obj1.display();
		Student obj2=new Student("Arun",94,83,81);
		obj2.display();
	}
	public Student(String name,int mathsmark,int sciencemark,int englishmark)
	{
		this.name=name;
		this.mathsmark=mathsmark;
		this.sciencemark=sciencemark;
		this.englishmark=englishmark;
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
	}}
public void display()
{
	int totalmark=caltotalmark();
	String grade=findgrade(totalmark);
	System.out.println("Name:" +name);
	System.out.println("Maths mark:" +mathsmark);
	System.out.println("Science mark:" +sciencemark);
	System.out.println(" English mark:"+englishmark);
	System.out.println("Total mark:"+totalmark);
	System.out.println("Garde of student:"+grade);
}}
