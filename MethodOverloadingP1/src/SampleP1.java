class Register
{
	void input(String stuname,int m1,int m2)
	{
		System.out.println("Your value is::"+stuname+""+m1+""+m2);
	}
	void input(String stuname,int tot)
	{
		System.out.println("Your value is::"+stuname+""+tot);
	}
}
public class SampleP1 {

	public static void main(String[] args) {
		
		Register t1=new Register();
		t1.input("azar",100,200);
		t1.input("azar",300);

	}

}
