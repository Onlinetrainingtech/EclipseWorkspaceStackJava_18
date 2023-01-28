import java.util.ArrayDeque;

public class Sample 
{
    void get1()
    {
    	ArrayDeque<Integer> obj=new ArrayDeque<Integer>();
    	obj.addFirst(2001);
    	obj.add(1001);
    	obj.add(1002);
    	obj.add(1003);
    	obj.addLast(3001);
    	
    	System.out.println("Your data is::"+obj);
    	System.out.println(""+obj.getFirst());
    	System.out.println(""+obj.getLast());
    }
	public static void main(String[] args) {
	
		Sample d1=new Sample();
		d1.get1();

	}

}
