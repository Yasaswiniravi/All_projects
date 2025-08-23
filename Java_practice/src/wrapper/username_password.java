package wrapper;
class user_pass{
	String username;
	String password;
}
public class username_password {
	static void update_crediantials(user_pass up)
	{
		up.username="admin123";
		up.password="pass@123";
	}

	public static void main(String[] args) {
		user_pass up=new user_pass();
		up.username="user123";
		up.password="user@123";
		update_crediantials(up);
		System.out.println("username="+up.username);
		System.out.println("password="+up.password);

		// TODO Auto-generated method stub

	}

}
