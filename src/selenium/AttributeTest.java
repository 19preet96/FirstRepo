package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AttributeTest {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.gecko.driver", "C:/Learning/Program/SeleniumJars/geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://www.ebay.ca/");
		
		Thread.sleep(2000);
		
		String expectedLabel = "Search for anything";
		
		String actualLabel = driver.findElement(By.id("gh-ac")).getAttribute("placeholder");
		
		
		driver.findElement(By.id("gh-ac")).sendKeys("Iphone");
		
		String p = driver.findElement(By.id("gh-ac")).getAttribute("value");
		
		System.out.println(p);
		
		driver.findElement(By.id("gh-btn")).click();
		
		if (expectedLabel.equals(actualLabel)) {
			System.out.println("Test passed");
		}else {
			System.out.println("Test Failed");
		}
		

	}

}
