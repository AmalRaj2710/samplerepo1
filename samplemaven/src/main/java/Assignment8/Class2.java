package Assignment8;

public class Class2 extends Class1 {
	double hra;
	double pf;
public static void main(String args[])
{
	Class2 obj=new Class2();
	obj.calculate();
}
public void calculate()
{
	hra=basicpay*0.05;
	pf=basicpay*0.2;
}
}
