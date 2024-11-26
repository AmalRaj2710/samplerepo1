package Assignment8;

public class Class3 extends Class2 {
double totalsalary;
	public static void main(String[] args) {
		Class3 obj=new Class3();
		obj.Class1(12000, 500, 750);
		obj.calculate();
		obj.tatal();
	}
	
public void tatal() {
	totalsalary=(basicpay+hra-pf-deduction+bonus);
	System.out.println("Total salary :"+totalsalary);
	System.out.println("SALARY SLIP");
	System.out.println("Basic pay : " +basicpay +"\n Deduction : " +deduction +"\n HRA : "+hra +"\n PF : "+pf +"\n Bonus :" +bonus +"\n Total Salary : "+totalsalary);
}
}
