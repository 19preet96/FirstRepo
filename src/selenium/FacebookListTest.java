package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FacebookListTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:/Learning/Program/SeleniumJars/geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://www.facebook.com");
		
		//WebElement footer = driver.findElement(By.id("pageFooterChildren")); 
		//List<WebElement> allLinks = footer.findElements(By.tagName("li"));
		List<WebElement> allLinks = driver.findElements(By.xpath("//div[@id='pageFooterChildren']/ul/li"));
		
		System.out.println(allLinks.size());
		
		
		for(int i=0; i<allLinks.size();i++) {
		
			System.out.println(allLinks.get(i).getText());
			
			if(allLinks.get(i).getText().equals("People")) {
				allLinks.get(i).click();
				break;
			
			}	
			
		}
			
		
		
		if(allLinks.size() == 34) {
			System.out.println("Test Passed");	
		} else {
			System.out.println("Test Failed");
		}
		

	}

}
