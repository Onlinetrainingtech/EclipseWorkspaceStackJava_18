class Demo
{
	Demo()//default cons
	{
		System.out.println("This is default cons..");
	}
	Demo(int pid)//param cons
	{
		System.out.println("This is pid.."+pid);
	}
}
public class SampleP1 {

	public static void main(String[] args) {
		
		new Demo();//default cons..
		new Demo(1001);

	}

}
