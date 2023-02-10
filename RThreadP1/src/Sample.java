class Demo extends Thread
{
	public void run()
	{
		try
		{
		System.out.println("ThreadIn");
		System.out.println("CurrentThread::"+Thread.currentThread().getName());
		Thread.sleep(10000);
		System.out.println("ThreadOut");
		System.out.println("Priority::"+Thread.currentThread().getPriority());
		}
		catch(InterruptedException t)
		{
			System.out.println(t);
		}
		
	}
}
public class Sample {

	public static void main(String[] args) {
		
		Demo t1=new Demo();
		Demo t2=new Demo();
		t1.start();
		try
		{
			System.out.println("JoinIN");
			t1.join(10000);
			System.out.println("JoinOut");
		}
		catch(InterruptedException t)
		{
			
		}
		t2.start();
		t1.setName("CurrentThread");
		t1.setPriority(Thread.MAX_PRIORITY);
		System.out.println(""+t1.isAlive());
		System.out.println(""+t1.isInterrupted());

	}

}
