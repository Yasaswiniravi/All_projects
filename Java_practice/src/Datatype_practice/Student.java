package Datatype_practice;

public class Student {
	String name="anu";
	int rollno=47;
	float per=86.08f;
	short age=22;
	String course="java";
	char div='A';
	
	public static void main(String[] args) {
		Student stud=new Student();
		System.out.println("Name  ="+stud.name);
		System.out.println("Rollno ="+stud.rollno);
		System.out.println("percentage  ="+stud.per);
		System.out.println("Age ="+stud.age);
		System.out.println("course ="+stud.course);
		System.out.println("Division ="+stud.div);
		
	}

}
