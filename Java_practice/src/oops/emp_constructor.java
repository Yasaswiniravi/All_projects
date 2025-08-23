package oops;

public class emp_constructor {
	emp_constructor()
	{
		System.out.println("Default constructor");
	}
	emp_constructor(int id,String name)
	{
		System.out.println("id is="+id);
		System.out.println("name ="+name);
	}
	emp_constructor(String name,int id)
	{
		System.out.println("id is="+id);
		System.out.println("name ="+name);
	}
	emp_constructor(int id,String name,float salary)
	{
		System.out.println("id is="+id);
		System.out.println("name ="+name);
		System.out.println("salary"+salary);
	}
	public static void main(String[] args) {
		emp_constructor emp =new emp() 
		
	}

}
