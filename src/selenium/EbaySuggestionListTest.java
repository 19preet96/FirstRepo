package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EbaySuggestionListTest {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "C:/Learning/Program/SeleniumJars/geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://www.ebay.ca/");
		
		driver.findElement(By.id("gh-ac")).click();
		driver.findElement(By.id("gh-ac")).sendKeys("iphone");
		Thread.sleep(2000);
		
		List<WebElement> searchEbay = driver.findElements(By.xpath("//div[@id='gAC']/ul/li"));
		
		System.out.println(searchEbay.size());
		
		
		for(WebElement x : searchEbay) {
			System.out.println(x.getText());
		}

	}

}
