package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class zerobanklogin {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("http://zero.webappsecurity.com/login.html");
		System.out.println("welcome to zero bank page");
		
		{
			System.out.println("manual test::->check user is unable to login with invalid username and valid password crediantials");
		}
		
		driver.findElement(By.id("user_login")).click();
		driver.findElement(By.id("user_login")).sendKeys("67389374");
		
		driver.findElement(By.id("user_password")).click();
		driver.findElement(By.id("user_password")).sendKeys("password");
		
		driver.findElement(By.name("submit")).click();
		System.out.println("login unsuccessfully");
		
		
		{
			System.out.println("manual test::->check user is unable to login with valid username and invalid password crediantials");
		}
		
		driver.findElement(By.id("user_login")).click();
		driver.findElement(By.id("user_login")).sendKeys("username");
		
		driver.findElement(By.id("user_password")).click();
		driver.findElement(By.id("user_password")).sendKeys("jdnhsjfk");
		
		driver.findElement(By.name("submit")).click();
		System.out.println("login unsuccessfully");
		
		{
			System.out.println("manual test::->check user is able to login with null crediantials");
		}
		
		driver.findElement(By.id("user_login")).click();
		driver.findElement(By.id("user_login")).sendKeys("");
		
		driver.findElement(By.id("user_password")).click();
		driver.findElement(By.id("user_password")).sendKeys("");
		
		driver.findElement(By.name("submit")).click();
		System.out.println("login unsuccessfully");
		

		{
			System.out.println("manual test::->check user is able to login with valid crediantials");
		}
		
		driver.findElement(By.id("user_login")).click();
		driver.findElement(By.id("user_login")).sendKeys("username");
		
		driver.findElement(By.id("user_password")).click();
		driver.findElement(By.id("user_password")).sendKeys("password");
		
		driver.findElement(By.name("submit")).click();
		System.out.println("login successfully");
		System.out.println("welcome to zero bank page");

		Thread.sleep(5000);
		driver.close();
	}

}
