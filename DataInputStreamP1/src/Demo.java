import java.io.DataInputStream;
import java.io.IOException;

class Sample
{
	int empid;//global variables
	String empname;
	DataInputStream dis=new DataInputStream(System.in);//to create the DataInputStream Objects
	void input()throws IOException
	{
		System.out.println("Enter the empid::");
		empid=Integer.parseInt(dis.readLine());//to get the data to the user
		System.out.println("Enter the empname::");
		empname=dis.readLine();
		//Integer--is a wrapper class
		//readLine--is a method
		
	}
	void display()
	{
		System.out.println("Your Empid is::"+empid);
		System.out.println("Your Empname is::"+empname);
	}
}
public class Demo {

	public static void main(String[] args) throws IOException {
		
		Sample s1=new Sample();
		s1.input();
		s1.display();

	}

}
