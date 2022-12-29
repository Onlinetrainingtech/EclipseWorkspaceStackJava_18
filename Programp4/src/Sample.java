class Demo
{
	void fun1(int pid)//passsing arguments/parameters
	{//function defination
		System.out.println("Your value is::"+pid);
	}
	void fun2(int cid,String cname)
	{
		System.out.println("Your value is::"+cid+""+cname);
	}
}
public class Sample {

	public static void main(String[] args) {
		
		Demo t1=new Demo();
		t1.fun1(1001);
		t1.fun2(2001,"mobile");

	}

}
