package control_statement;
/* write a java program using if -else stmt that checks a person's eligibility for entry an
discount offers based on the following condition
1. the person must be 18 years or older and must have an id card to be allowed entry
2.the person gets a student discount if they are under 18 or if they are a student*/
public class Eligiblitycheck {
	public static void main(String[] args) {
		int age=17;
		boolean idcard= true;
		boolean isstudent= true;
		if(age>=18 && idcard) {
			System.out.println("entry allowed");
		}
		else {
			System.out.println("get student discount");
		}
		
	}

}
