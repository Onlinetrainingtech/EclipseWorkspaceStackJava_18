class Demo
{
	static int score=1000;
	Demo()
	{
		score++;
		System.out.println("Your value is::"+score);
	}
}
public class Sample {

	public static void main(String[] args) {
		
		new Demo();
		new Demo();

	}

}
