package Exception;

public class Finally {

	public static void main(String[] args) {
		try {
			int[] a=new int[4];
			System.out.println(a[6]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("important code");
		}
		// TODO Auto-generated method stub

	}

} 
