package wrapper;

public class password {
	public static void changepassword(String password)
	{
		password="newpassword";
	}

	public static void main(String[] args) {
		String password="oldpassword";
		changepassword(password);
		System.out.println("password method="+password);
		// TODO Auto-generated method stub

	}

}
