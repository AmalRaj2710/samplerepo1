package excelread;

import java.io.IOException;

public class Excelreadmain {

	public static void main(String[] args)throws IOException
	{
		
		 System.out.println(Excelread1.getStringdata(1, 0));
	     System.out.println(Excelread1.getIntegerdata(1, 1));
	     System.out.println(Excelread1.getStringdata(2, 0));
	     System.out.println(Excelread1.getIntegerdata(2, 1));

		
	}

}
