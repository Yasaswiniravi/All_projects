package wrapper;

public class Boxing {

	public static void main(String[] args) {
		//Autoboxing(convert primitive to wrapper classes)
		int num=10;
		System.out.println("primitive="+num);
		Integer num1=num;
		System.out.println("wrap data="+num1);
		
		//unboxing(convert wrappers to primitive)
		Integer a=20;
		System.out.println("for object="+a);
		int b=a;
		System.out.println("for primitive data type in="+b);
		
		String str="12345";
		int ab=Integer.parseInt(str);
		System.out.println(ab);
		
		String n=Integer.toString(num);
		System.out.println(n);

		char ch='5';
		System.out.println(Character.isDigit(ch));
		
		String input="A1B2C3";
		int lettercount=0;
		int digitcount=0;
		for(int i=0;i<input.length();i++)
		{
			char Ch=input.charAt(i);
			if(Character.isDigit(Ch)) {
				System.out.println(Ch+"is a digit");
				digitcount++;
			}
			else if(Character.isLetter(Ch)) {
				System.out.println(Ch+"is a letter");
				lettercount++;
			}
		}
		System.out.println("letters:"+lettercount);
		System.out.println("digits:"+digitcount);
		
	}

}
