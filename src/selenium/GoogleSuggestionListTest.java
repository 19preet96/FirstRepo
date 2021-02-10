package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleSuggestionListTest {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "C:/Learning/Program/SeleniumJars/geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://www.google.ca/?gws_rd=ssl");
		
		driver.findElement(By.xpath("//input[@name='q']")).click();
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Canada");
		Thread.sleep(2000);
		
		List<WebElement> searchG = driver.findElements(By.xpath("//ul[@role='listbox']/li"));
		
		System.out.println(searchG.size());
		
		/*
		 * for(int i=0;i<searchG.size();i++) {
		 * System.out.println(searchG.get(i).getText()); }
		 */
		
		for(WebElement x : searchG) {
			System.out.println(x.getText());
		}
		
		
		
		

	}

}
