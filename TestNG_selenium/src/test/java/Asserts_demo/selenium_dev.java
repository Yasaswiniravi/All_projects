package Asserts_demo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;

public class selenium_dev {
	WebDriver driver;
	boolean stopExecution=true;
  
  @BeforeClass
  public void beforeClass() {
	  driver=new ChromeDriver();
	  driver.get("https://www.selenium.dev/");
	  driver.manage().window().maximize();
  }
  @Test
  public void f()  {
	  String expectedtitle="Selenium";
	  String actualtitle=driver.getTitle();
	  Assert.assertEquals(actualtitle, expectedtitle,"title validation fail");
	  System.out.println("expectedtitle:"+expectedtitle);
	  System.out.println("actualtitle:"+actualtitle);
	 // throw new SkipException("stopping test here");
  }
  @Test
  public void url() {
	  String expectedurl="https://www.selenium.dev/n";
	  String actualurl=driver.getCurrentUrl();
	  Assert.assertEquals(actualurl, expectedurl,"url validation fail");
	  System.out.println("expectedurl:"+expectedurl);
	  System.out.println("actualurl:"+actualurl);
	  throw new SkipException("stopping test here");

  }

  @AfterClass
  public void afterClass() {
	  driver.close();
  }

}
