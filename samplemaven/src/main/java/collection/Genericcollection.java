package collection;

import java.util.ArrayList;
import java.util.List;

public class Genericcollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<String>s= new ArrayList<String>();//arrayList<String>s= new ArrayList<String>()
s.add("blue");//add method elements add 
s.add("red");
s.add("green");
s.add("white");
s.add("green");
System.out.println(s);
s.set(1, "violet");//replace an element we use set
System.out.println(s);
//s.indexOf("red");
System.out.println(s.indexOf("green"));
System.out.println(s.lastIndexOf("green"));
s.remove(4);
System.out.println(s);
System.out.println(s.get(2));
System.out.println(s.contains("blue"));
	}

}
