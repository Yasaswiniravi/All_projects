package looping_practice;

public class for_loop {

	public static void main(String[] args) {
//		for(int i=0;i<5;i++)
//		{
//			for(int j=0;j<3;j++)
//			{
//				System.out.print("*   ");
//			}
//			System.out.println();
//		}
//		for(int i=0;i<5;i++)
//		{
//			for(int j=0;j<=i;j++)
//			{
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
//		for(int i=0;i<5;i++)                 //* * * * *
//		{                                    //* * * *
//			for(int j=i;j<5;j++)             //* * *
//			{                                //* *
//				System.out.print("*  ");
//			}
//			System.out.println();
//		}
		for(int i=1;i<=10;i++)                 
		{                                    
			for(int j=1;j<=10;j++)             //multiplication
			{                                
				System.out.print(i*j+ "\t ");
			}
			System.out.println();
		}
	}

}
