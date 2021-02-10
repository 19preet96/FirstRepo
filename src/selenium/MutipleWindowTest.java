package selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MutipleWindowTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:/Learning/Program/SeleniumJars/geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://moodle.cestarcollege.com/moodle/");
		
		driver.findElement(By.linkText("Faq")).click();
		
		Set<String> allWindows = driver.getWindowHandles();
		
		System.out.println(allWindows.size());
		
		Iterator<String> iter = allWindows.iterator(); //we use iterator to get handles of new window
		
		String mainWindow = iter.next();
		String childWindow = iter.next();
		
		driver.switchTo().window(childWindow);
		System.out.println(driver.getTitle());
		driver.close();
		
		
		driver.switchTo().window(mainWindow);
		System.out.println(driver.getTitle());
		driver.quit();
		
		
		
		

	}

}
