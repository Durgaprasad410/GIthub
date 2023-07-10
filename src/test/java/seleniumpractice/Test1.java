package seleniumpractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class Test1 {
	
	
	@Test
public void m1()
{

	WebDriver driver=new ChromeDriver();
	driver.get("http://localhost:8888/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("admin",Keys.TAB,"admin",Keys.TAB,Keys.ENTER);
	
}
}