import java.util.ArrayList;
import java.util.HashSet;

class Demo
{
	HashSet<Integer>list1=new HashSet<Integer>();
	//ArrayList<Integer>list1=new ArrayList<Integer>();
	void get1()
	{
		list1.add(1001);
		list1.add(1002);
		list1.add(1003);
		list1.add(1003);
		
		System.out.println("Your data is::"+list1);
		System.out.println("Your data is::"+list1.size());
		System.out.println("Removing the data is::"+list1.remove(1001));
		System.out.println("After removing size of the data is::"+list1.size());
		System.out.println("Searching data is::"+list1.contains(1001));
		
	}
}
public class Sample {

	public static void main(String[] args)
	{
		
		Demo f1=new Demo();
		f1.get1();

	}

}
