import java.util.Scanner;

public class SampleP2 {

	int m1,m2,m3,tot;
	Scanner sc=new Scanner(System.in);
	void get1()
	{
		System.out.println("Enter the marks::");
		m1=sc.nextInt();
		m2=sc.nextInt();
		m3=sc.nextInt();
		tot=m1+m2+m3;
		
	}
	void get2()
	{
		if(tot>900)
		{
			System.out.println("Grade-A");
		}
		else if(tot>=700)
		{
			System.out.println("Grade-B");
		}
		else if(tot>=500)
		{
			System.out.println("Grade-C");
		}
		else
		{
			System.out.println("No Grades");
		}
	}
	public static void main(String[] args) {
		
		
		SampleP2 s1=new SampleP2();
		s1.get1();
		s1.get2();
		

	}

}
