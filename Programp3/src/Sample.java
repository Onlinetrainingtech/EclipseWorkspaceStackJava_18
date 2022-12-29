class Demo
{
   String pname="apple";//global or class or instance variable
   void get1()//methods
   {
	   int pid=1000;//local variable
	   System.out.println("This is local variables::"+pid);
   }
   void get2()
   {
	   System.out.println("This is global variable::"+pname);
   }
}
public class Sample {

	public static void main(String[] args) {
		
		Demo f1=new Demo();//creating the instances
		f1.get1();//To invoke the methods
		f1.get2();

	}

}
