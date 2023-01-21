import java.util.Scanner;

public class SampleP1 {

	public static void main(String[] args) {
		
		//String stuname[]={"Azar","mohamed"};
		
		String stuname[]=new String[3];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<3;i++)
		{
			System.out.println("Enter the name is::");
			stuname[i]=sc.next();
			System.out.println("Your value is::"+stuname[i]);
		}
		
//		for(int i=0;i<stuname.length;i++)
//		{
//			System.out.println("Your value is::"+stuname[i]);
//		}
		//System.out.println("Your value is::"+stuname[0]);
		//System.out.println(""+stuname[1]);
		

	}

}
