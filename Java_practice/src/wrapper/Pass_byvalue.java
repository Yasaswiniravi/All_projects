package wrapper;

public class Pass_byvalue {
	String name="Classtest";
	void show(String name1)
	{
		name=name1;
		System.out.println(name);
	}

	public static void main(String[] args) {
		Pass_byvalue obj=new Pass_byvalue();
		System.out.println(obj);
		obj.show("methodtest");
		// TODO Auto-generated method stub

	}

}
