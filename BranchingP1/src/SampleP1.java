import java.util.Scanner;

class Demo
{
	int age,salary,bns;
	Scanner sc=new Scanner(System.in);

	void get1()
	{
       System.out.println("Enter the age is::");
       age=sc.nextInt();
       if(age>=61)
       {
    	   System.out.println("Enter the Salary is::");
    	   salary=sc.nextInt();
    	   if(salary>=20000)
    	   {
    		   bns=salary+500;
    		   System.out.println("Your salary is::"+bns);
    	   }
    	   else
    	   {
    		   bns=salary+1000;
    		   System.out.println("Your salary is::"+bns);
    	   }
       }
       else
       {
    	   System.out.println("Your age is low..");
       }
	}
	
}

public class SampleP1 {

	public static void main(String[] args) {
		
		Demo f1=new Demo();
		f1.get1();

	}

}
