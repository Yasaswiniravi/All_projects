package automation;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.firefox.FirefoxDriver;


public class first {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("hello");
		//set browser (chromedriver,firefox driver)
		//System.setProperty(, null);
		//create object for browser
		//set web application URL
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.selenium.dev");

		String expectedurl="https://www.selenium.dev/";
		String actualurl=driver.getCurrentUrl();
		
		System.out.println("expected url:"+expectedurl);
		System.out.println("actualurl:"+actualurl);
		
		driver.manage().window().maximize();
		Thread.sleep(5000);
		if(expectedurl.equals(actualurl))
		{
			System.out.println("url validation successfull");
		}
		else {
			System.out.println("url failed");
		}
		driver.close();
		System.out.println("Page load succesfully");
	
		

	}
}

