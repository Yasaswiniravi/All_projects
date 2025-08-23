package automation;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
public class titlevalidation {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.selenium.dev");

		String expectedtitle="Selenium";
		String actualtitle=driver.getTitle();
		
		System.out.println("expected title:"+expectedtitle);
		System.out.println("actualtitle:"+actualtitle);
		
		driver.manage().window().maximize();
		Thread.sleep(5000);
		if(expectedtitle.equals(actualtitle))
		{
			System.out.println("title validation successfull");
		}
		else {
			System.out.println("title failed");
		}
		driver.close();
		System.out.println("Page load succesfully");
		
		// TODO Auto-generated method stub

	}

}
