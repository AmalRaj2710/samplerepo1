package assignment6;
public class Average {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("average of integer = "+Average.averagenum(9,6,1));
System.out.println("Average of float number = "+Average.averagenum (9.6f, 8.4f, 4.8f));
Average obj=new Average();
obj.area(3.14f, 5);
obj.area(13, 10);
obj.area(6);
	}
	public static double averagenum(int n1,int n2,int n3)
	{
		return (n1+n2+n3)/3;
	}
	public static float averagenum(float f1,float f2,float f3)
	{
		return (f1+f2+f3)/3;
	}
public void area(float pi,int radius)
{	float area=pi*radius*radius;
	System.out.println("area of circle= "+area);
}
public void area(int leng,int width)
{
int area=leng*width;
System.out.println("area of rectangle= "+area);
}
public void area(int side)
{
	int area=side*side;
	System.out.println("area of squre= "+area);
}
}
