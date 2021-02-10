package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class TDSearchTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:/Learning/Program/SeleniumJars/geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		
		Actions builder = new Actions(driver);
		
		driver.get("https://www.td.com/ca/en/personal-banking/");
		
		WebElement sIcon = driver.findElement(By.xpath("//a[@class='td-desktop-search-show-btn']"));
		
		builder.moveToElement(sIcon).build().perform();
		
		WebElement search = driver.findElement(By.xpath("//a/span[contains(text(),'Search')]"));
		
		search.click();
		
		driver.findElement(By.xpath("//input[@aria-label='Search']")).sendKeys("Credit Card");
		driver.findElement(By.xpath("//input[@aria-label='Search']")).sendKeys(Keys.ENTER);
		
		
		

	}

}
