package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class YahooSuggestionListTest {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "C:/Learning/Program/SeleniumJars/geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://ca.yahoo.com/");
		
		driver.findElement(By.id("header-search-input")).click();
		driver.findElement(By.id("header-search-input")).sendKeys("Canada");
		Thread.sleep(2000);
		
		List<WebElement> searchYahoo = driver.findElements(By.xpath("//ul[@role='listbox']/li"));
		
		System.out.println(searchYahoo.size());
		
		
		for(WebElement x : searchYahoo) {
			System.out.println(x.getText());
			if(!(x.getText().contains("canada"))) {
				System.out.println("Fail");
			
			}
			
		}

		
		
	}

}
