import java.util.HashMap;
import java.util.Map;

public class Sample 
{
	HashMap<Integer,String>list1=new HashMap<Integer,String>();
    void get1()
    {
    	list1.put(1001,"azar");
    	list1.put(1002,"mohamed");
    	list1.put(1003,"raja");
    	for(Map.Entry h1:list1.entrySet())
    	{
    		System.out.println(h1.getKey());
    		System.out.println(h1.getValue());
    	}
    	System.out.println("Searching the data is::"+list1.containsKey(1001));
    	System.out.println("Remove the data is::"+list1.remove(1001));
    	System.out.println("After removing size::"+list1.size());
    	
    	
    }
	public static void main(String[] args) {
		
		Sample t1=new Sample();
		t1.get1();

	}

}
