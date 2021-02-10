package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebElementTest {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "C:/Learning/Program/SeleniumJars/geckodriver.exe");
		
		//FirefoxDriver driver = new FirefoxDriver();
		
		//InterfaceName objName = new ClassName();
	    WebDriver driver = new FirefoxDriver();
		
		
		driver.get("https://accounts.google.com/signin/v2/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		
		WebElement email = driver.findElement(By.id("identifierId"));
		email.sendKeys("j@h.com");
		//driver.findElement(By.id("identifierId")).sendKeys("j@h.com");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@class='VfPpkd-RLmnJb']")).click();
		

	}

}
