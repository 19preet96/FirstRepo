package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CSSSelectorTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:/Learning/Program/SeleniumJars/geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.cssSelector("input[name='email']")).sendKeys("j@sada.com");
		driver.findElement(By.cssSelector("#pass")).sendKeys("pass");
		driver.findElement(By.cssSelector("button[name='login']")).click();
		
		

	}

}
