package selenium;

import org.openqa.selenium.By;

import org.openqa.selenium.firefox.FirefoxDriver;

public class FacebookLoginTest {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "C:/Learning/Program/SeleniumJars/geckodriver.exe");
		
		
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com");
		
		//driver.findElement(By.className("inputtext _55r1 _6luy")).sendKeys("j@h.com"); failed because attr contains spaces
		//driver.findElement(By.id("email")).sendKeys("j@h.com"); working
		//driver.findElement(By.name("email")).sendKeys("j@h.com"); // working
		//driver.findElement(By.tagName("input")).sendKeys("j@h.com"); fails not unique and not first
		
		//driver.findElement(By.xpath(null))
		
		//driver.findElement(By.name("pass")).sendKeys("asda");
		//driver.findElement(By.name("login")).click();
		
		
		//works with xpath too
		driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy']")).sendKeys("jxh");
		driver.findElement(By.xpath("//div/input[@class='inputtext _55r1 _6luy' and @name='pass']")).sendKeys("pass");
		driver.findElement(By.xpath("//div/button[starts-with(@id,'u_0')]")).click();
		
	}
	
	

	
}
