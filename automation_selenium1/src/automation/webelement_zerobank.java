package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webelement_zerobank {
	public static void loginStep(WebDriver driver,String user1,String pass1,String testexecution) throws InterruptedException {
		System.out.println("Manual test-->"+testexecution);
		WebElement user=driver.findElement(By.id("user_login"));
		user.sendKeys(user1);
		//locating password text field
		WebElement pass=driver.findElement(By.id("user_password"));
		//pass.click()
		pass.sendKeys(pass1);
		//click on signin button
		driver.findElement(By.name("submit")).click();
		Thread.sleep(5000);
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("http://zero.webappsecurity.com/login.html");
		System.out.println("welcome to zerobank login page");
		
		loginStep(driver,"64775","password","Unable to login");
		loginStep(driver,"username","56372764","Unable to login");
		loginStep(driver,"8487fhu","hfnjd4657","Unable to login");
		loginStep(driver,"","","Unable to login");
		loginStep(driver,"username","password","User is able to login succesfully");

		

	}

}
