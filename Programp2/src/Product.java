
public class Product {
 
	int t1=100;
	void addProduct()//method
	{
		System.out.println("This is addProduct methods.."+t1);
	}
	void display()
	{
		System.out.println("This is display method..");
	}
	
	public static void main(String[] args)
	{
		Product t1=new Product();
		t1.addProduct();
		t1.display();

	}

}
