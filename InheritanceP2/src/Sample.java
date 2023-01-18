class B
{
	int cid=1001;
	String cname="mobile";
	void get1()
	{
		System.out.println(""+cid);
	}
}
class D1 extends B
{
    String feedback="good";
	void get2()
	{
		System.out.println(""+cname);
	}
}
class D2 extends D1
{
	void get3()
	{
		System.out.println(""+feedback);
	}
}
public class Sample {

	public static void main(String[] args) {
		
		D2 t1=new D2();//object creations
		t1.get1();
		t1.get2();
		t1.get3();
	}

}
