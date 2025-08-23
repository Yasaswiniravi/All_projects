package Exception;

public class Throws_demo {
	void add(int a,int b)
	{
		int sum=a+b;
		System.out.println("addition="+sum);
	}
	void div(int a,int b) throws ArithmeticException
	{
		int div=a/b;
		System.out.println("division="+div);
	}

	public static void main(String[] args) {
		Throws_demo d=new Throws_demo();
		System.out.println(d);
		// TODO Auto-generated method stub

	}

}
