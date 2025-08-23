package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import graphql.Assert;

public class Assertsdemo {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.ebay.com/");
		Thread.sleep(5000);
		driver.manage().window().maximize();
		Assert.assertTrue(false,"No, search button is not available on page");
		WebElement search=driver.findElement(By.id("gh-ac"));
		search.sendKeys("Watch");
		search.sendKeys(Keys.ENTER);
		
	}
}
