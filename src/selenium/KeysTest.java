package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.firefox.FirefoxDriver;

public class KeysTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:/Learning/Program/SeleniumJars/geckodriver.exe");
		
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://login.yahoo.com/?.src=fpctx&.intl=ca&.lang=en-CA&.done=https://ca.yahoo.com&activity=uh-signin&pspid=2142623533");
		
		driver.findElement(By.id("login-username")).sendKeys("asdasd@g.com");
		driver.findElement(By.id("login-username")).sendKeys(Keys.ENTER);
		
		

	}

}
