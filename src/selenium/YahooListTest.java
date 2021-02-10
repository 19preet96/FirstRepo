package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class YahooListTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:/Learning/Program/SeleniumJars/geckodriver.exe");
		
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://ca.yahoo.com/");
		
		List<WebElement> allLinks = driver.findElements(By.xpath("//li[@class='trending-list']/ul/li"));
		
		System.out.println(allLinks.size());
		
		
		for(int i=0; i<allLinks.size();i++) {
		
			System.out.println(allLinks.get(i).getText());
			
			
			}
			
		
		
		if(allLinks.size() == 10) {
			System.out.println("Test Passed");	
		} else {
			System.out.println("Test Failed");
		}

	}

}
