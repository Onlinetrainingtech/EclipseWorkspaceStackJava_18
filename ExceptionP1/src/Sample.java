class Demo
{
	void get1()
	{
		try
		{
		int a=100,c;
		c=a/10;
		System.out.println("Your value is::"+c);
		}
		catch(ArithmeticException r)
		{
			System.out.println("please check the input..");
		}
		finally
		{
			System.out.println("This is finally block");
		}
		get2();
	}
	void get2()
	{
		System.out.println("This is get2 function..");
	}
	void get3()
	{
		try
		{
			String name=null;
			System.out.println(name.length());
		}
		catch(NullPointerException t)
		{
			System.out.println("Please check string..");
		}
	}
}
public class Sample {

	public static void main(String[] args) {
		
		Demo g1=new Demo();
		g1.get1();
		g1.get3();
		

	}

}
