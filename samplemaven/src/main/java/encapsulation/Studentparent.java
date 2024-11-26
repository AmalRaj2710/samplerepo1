package encapsulation;

public class Studentparent {
private String name;
private int mark;
public void setter(String name,int mark)
{
this.name=name;
this.mark=mark;
}
public void getter()
{
	//System.out.println(name +"  " +mark);
	System.out.println("name of student: "+name);
	System.out.println("mark of student= "+mark);
}
}
