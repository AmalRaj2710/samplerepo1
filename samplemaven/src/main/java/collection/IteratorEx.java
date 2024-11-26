package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String>s= new ArrayList<String>();
		s.add("red");
		s.add("blue");
		s.add("green");
		s.add("white");
		s.add("green");
		s.add("violet");
		System.out.println(s);
		Iterator it=s.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		it.remove();
		System.out.println(s);
	}

}
