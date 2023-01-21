abstract class Demo
{
	abstract void addProduct();
	void get1()
	{
		System.out.println("This get1 method..");
	}
}
class Foo extends Demo
{
	public void addProduct()
	{
		System.out.println("This is addProduct...");
	}
}
public class Sample {

	public static void main(String[] args) {
		
       Foo f1=new Foo();
       f1.get1();
       f1.addProduct();
		
		
	}

}
