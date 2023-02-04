class Demo implements Runnable
{
	public void run()//Process1
	{
		System.out.println("This is a thread method..");
	}
	void get1()
	{
		System.out.println("This get1 function..");
	}
}


public class Sample {

	public static void main(String[] args) {
		
		Demo t1=new Demo();
		Thread t2=new Thread(t1);
		t2.start();
		t1.get1();

	}

}
