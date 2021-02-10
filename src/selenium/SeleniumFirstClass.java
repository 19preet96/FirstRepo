package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumFirstClass {
	
// Right Click on project + build path + configure build path + Java build path tab + libraries + add jar file

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.gecko.driver", "C:/Learning/Program/SeleniumJars/geckodriver.exe");
		//ClassName objName= new ClassName
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com" ); // to open the url
		
		driver.findElement(By.id("email")).sendKeys("jackharper@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Password");
		//driver.findElement(By.id("u_0_b")).click();
		driver.findElement(By.name("login")).click();
		
		

	}

}
