class Demo
{
	void ArithmeticOperators()
	{
		int a=100,b=200;//variable declaration
		System.out.println("Add::"+(a+b));
		System.out.println("Mul::"+(a*b));
		System.out.println("Div::"+(a/b));
		
	}
	void relationalOperators()
	{
		int a1=200,b1=100;
		System.out.println("Lessthan::"+(a1<b1));
		System.out.println("Greaterthan::"+(a1>b1));
		System.out.println("Equal::"+(a1==b1));
		System.out.println("Not Equal::"+(a1!=b1));
	}
	void logicalOperator()
	{
		int a2=200,b2=100;
		System.out.println("LoginAND::"+((a2>b2)&&(b2<a2)));
		System.out.println("LoginOR::"+((a2<b2)||(b2<a2)));
	}
	void bitwiseOperator()
	{
		int a=2,b=3;
		System.out.println("BitwiseAND::"+(a&b));
		System.out.println("BitwiseOR::"+(a|b));
		System.out.println("XOR::"+(a^b));
		System.out.println("1sCompl..::"+(~a));
		System.out.println("LeftShift::"+(a<<1));
		System.out.println("RightShift::"+(a>>1));
	}
}
public class Sample {

	public static void main(String[] args) {
		
		Demo t1=new Demo();
		//t1.ArithmeticOperators();
		//t1.relationalOperators();
		//t1.logicalOperator();
		t1.bitwiseOperator();

	}

}
