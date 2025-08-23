package Testing_package;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Tira_Beauty {
	WebDriver driver;
@BeforeClass
public void beforeTest() throws InterruptedException {
	driver=new ChromeDriver();
	//p=new Pageclass(driver);
	driver.get("https://www.tirabeauty.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  }
	
  @Test
  public void login() {
	  Actions act=new Actions(driver);
	  driver.navigate().to("https://www.tirabeauty.com/auth/login?redirectUrl=%252F");
	  driver.findElement(By.name("mobile-number")).sendKeys("9441917402");
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[3]/div/div/div[2]/div[2]/div[3]/div/div/div/div[1]/div/div[2]/div/img")).click();
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[3]/div/div/div[2]/div[2]/div[3]/div/div/div/div[2]/button")).click();

	  
  }
  @Test
  public void search() {
	  driver.navigate().to("https://www.tirabeauty.com/");
	  List<String> sr=new ArrayList<>();
	  sr.add("hairserum");
	  sr.add("face");
	  sr.add("sunscreen");
	  for(String item: sr) {
		 WebElement search= driver.findElement(By.id("search"));
		 search.clear();
         search.sendKeys(item);
         search.sendKeys(Keys.ENTER);
	  }
  }
  @Test
  public void addanddeletetocart() {
	  Actions act=new Actions(driver);
	  driver.navigate().to("https://www.tirabeauty.com/product/lakme-eyeconic-liquid-eyeliner---black-45ml-utwgvaxzwt");
	  driver.findElement(By.cssSelector("button[class=\"custom-btn primary lg no-tap-highlight\"]")).click();
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div/div[2]/div[2]/div[1]/div/div[3]/a/div[1]/img")).click();
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[4]/div/div/div/div/div/div[1]/div/div[1]/div[2]/div[2]/div/div/div[3]/div[2]/div/div/div/div[1]/div/div/button[1]/img")).click();
	  driver.findElement(By.cssSelector("button[class=\"remove\"]")).click();
  }
  @Test
  public void shopbycategory() {
	  driver.navigate().to("https://www.tirabeauty.com/");
	  
	  
	  
  }
}
