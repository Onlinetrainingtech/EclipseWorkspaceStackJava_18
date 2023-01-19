interface B
{
	void addProduct(); //service1
	
}
interface B2 extends B
{
	void viewProduct();//service2
}
class Demo implements B2
{
	public void addProduct()
	{
		System.out.println("This is the AddProduct...");
	}
	public void viewProduct()
	{
		System.out.println("This is the viewproduct...");
	}
}
public class Sample {

	public static void main(String[] args) {
		
		Demo t1=new Demo();
		t1.addProduct();
		t1.viewProduct();

	}

}
