class Demo
{
	public <M>M test(M t)//public int test(int t)
	{
		return t;
	}
}
public class Sample {

	public static void main(String[] args) {
		
		Demo r1=new Demo();
		System.out.println(r1.test(1001));
		System.out.println(r1.test("Azar"));
		System.out.println(r1.test(12.5));

	}

}
