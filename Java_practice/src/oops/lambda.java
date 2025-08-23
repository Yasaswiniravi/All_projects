package oops;
interface Even
{
	boolean iseven(int num);
}
public class lambda {

	public static void main(String[] args) {
		Even check=(num)->num%2==0;
		System.out.println(check.iseven(2));
		// TODO Auto-generated method stub

	}

}
