import java.util.Scanner;

class Demo
{
	int empid[]=new int[5];//Array delcartion
	int i,n;
	Scanner sc=new Scanner(System.in);//getting the input
	void get1()
	{
		System.out.println("Enter the n value is::");
		n=sc.nextInt();
		for(i=0;i<=n;i++)
		{
			System.out.println("Enter the array value is::");
			empid[i]=sc.nextInt();
			System.out.println(i);
		}
	}
	void display()
	{
		for(i=0;i<=n;i++)
		{
			System.out.println("Your Array value is::"+empid[i]);
		}
	}
}
public class Sample {

	public static void main(String[] args) {
		
		Demo f1=new Demo();
		f1.get1();
		f1.display();

	}

}
