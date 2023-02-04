class Demo extends Thread
{
	public void run()
	{
		try
		{
		System.out.println("ThreadIn");
		Thread.sleep(10000);
		System.out.println("ThreadOut");
		System.out.println("Your current thread::"+Thread.currentThread().getName());
		System.out.println("Your Thread Priority::"+Thread.currentThread().getPriority());
		}
		catch(InterruptedException t)
		{
			
		}
	}
}
public class Sample {

	public static void main(String[] args) {
		
		Demo t1=new Demo();
		Demo t2=new Demo();
		t1.start();
		t1.setName("GameOver");
		t2.start();
		t2.setPriority(Thread.MAX_PRIORITY);
		System.out.println(t1.isAlive());

	}

}
