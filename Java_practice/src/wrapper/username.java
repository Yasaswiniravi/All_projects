package wrapper;
//pass by value
public class username{
	String username,
	 password;
	static void update_credentials1(String username,
	String password)
	{
		username="admin123";
		password="Admin@123";
	}
	public static void main(String[] args) {
		username up1=new username();
		up1.username="User123";
		up1.password="User@123";
		update_credentials1("admin123","Pass@123");
		System.out.println("Username="+up1.username);
		System.out.println("password="+up1.password);
	}
 
}
