package oops;

public class this_keyword {
	int rollno,age;
	String name,collegename,address;
	float per;
	void details(int rollno,String name,float per)
	{
		this .rollno=rollno;
		this.name=name;
		this.per=per;
		System.out.println("rollno="+rollno);
		System.out.println("name="+name);
		System.out.println("per="+per);

	}
	void details(int rollno,String name)
	{
		this .rollno=rollno;
		this.name=name;
		System.out.println("rollno="+rollno);
		System.out.println("name="+name);
	}

	public static void main(String[] args) {
		this_keyword k=new this_keyword();
		k.details(10,"anu",89.07f);
		k.details(19,"mahi");
		// TODO Auto-generated method stub

	}

}
