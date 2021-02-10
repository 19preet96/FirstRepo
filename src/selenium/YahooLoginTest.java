package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class YahooLoginTest {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "C:/Learning/Program/SeleniumJars/geckodriver.exe");
		
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://login.yahoo.com/?.src=fpctx&.intl=ca&.lang=en-CA&.done=https://ca.yahoo.com&activity=uh-signin&pspid=2142623533");
		
		driver.findElement(By.id("login-username")).sendKeys("jbhv");
		driver.findElement(By.id("login-signin")).click();
	
		Thread.sleep(2000);
		
		String expectedErr = "Sorry, we don't recognize this email.";
		String actualErr = driver.findElement(By.id("username-error")).getText();
		
		if(expectedErr.equals(actualErr)) {
			System.out.println("Test Passed");	
		} else {
			System.out.println("Test Failed");
		}
		
		

	}

}
