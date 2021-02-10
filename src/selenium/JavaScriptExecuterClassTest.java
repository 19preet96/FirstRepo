package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JavaScriptExecuterClassTest {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "C:/Learning/Program/SeleniumJars/geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.adidas.ca/en");
		
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		
		WebElement aboutUs = driver.findElement(By.linkText("About Us"));
		
		System.out.println(aboutUs.getLocation());
		
		//option 1
		//jse.executeScript("window.scrollBy(0,3000)"); //manual method for scrolling using x and y co-ordinates
		
		//option 2
		//jse.executeScript("arguments[0].scrollIntoView(true);",aboutUs); //scroll until the element is in view
		
		//aboutUs.click();
		
		//option 3 without scrolling; just clicking using javaScriptExecutor
		jse.executeScript("arguments[0].click();",aboutUs);
		

	}

}
