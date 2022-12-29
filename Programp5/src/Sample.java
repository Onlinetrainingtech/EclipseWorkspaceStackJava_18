import java.util.Scanner;

class Demo
{
	int empid,salary;//global variable member variable declartion
	String empname;
	Scanner sc=new Scanner(System.in);
	void input()//method definations
	{
		System.out.println("Enter the value is empid::");
		empid=sc.nextInt();//getting the integer type of value
		System.out.println("Enter the value is salary::");
		salary=sc.nextInt();
		System.out.println("Enter the value is empname::");
		empname=sc.next();//getting the string type of value
	}
	void display()
	{
		System.out.println("Your value is::"+empid+""+salary+""+empname);
	}
}
public class Sample {

	public static void main(String[] args) {
		
		Demo t1=new Demo();
		t1.input();
		t1.display();

	}

}
