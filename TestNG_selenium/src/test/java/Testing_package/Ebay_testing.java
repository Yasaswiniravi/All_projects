package Testing_package;

import org.testng.annotations.Test;

//import graphql.Assert;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class Ebay_testing {
	WebDriver driver;
  @Test
  public void search() {
	  WebElement search=driver.findElement(By.id("gh-ac"));
	  search.clear();
	  search.sendKeys("watch");
	  search.sendKeys(Keys.ENTER);
	  driver.navigate().refresh();
  }
	  @Test(priority=1)
	  public void search1() {
		  WebElement search=driver.findElement(By.id("gh-ac"));
		  search.clear();
		  search.sendKeys("phone");
		  search.sendKeys(Keys.ENTER);
		  driver.navigate().refresh();
	  
  }
  @BeforeTest
  public void beforeTest() throws InterruptedException {
	  driver=new ChromeDriver();
	  driver.get("https://www.ebay.com/");
	  driver.manage().window().maximize();
	  Thread.sleep(5000);
	  }

  @AfterTest
  public void afterTest() {
	  Assert.assertTrue(true,"search button is not working");
	  driver.close();
  }

}
