package comparable_comparator;
import java.util.*;
class Student implements Comparable<Student>{
	int id;
	String name;
	Student(int id,String name){
		this.id=id;
		this.name=name;
	}
//	public int compareTo(Student s) { //sorting id
//		return id-s.id;
	public int compareTo(Student s) {  //comparing string
		return this.name.compareTo(s.name);
	}
	public String toString() {
		return id+" "+name;
	}

	public static void main(String[] args) {
		List<Student> list=new ArrayList<>();
		list.add(new Student(7,"anu"));
		list.add(new Student(6,"mahi"));
		list.add(new Student(4,"vishnu"));
		Collections.sort(list);
		for(Student s:list) {
			System.out.println(s);
		}
		// TODO Auto-generated method stub

	}

}
