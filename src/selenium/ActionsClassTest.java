package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClassTest {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.gecko.driver", "C:/Learning/Program/SeleniumJars/geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://www.ebay.ca/");
		
		WebElement electronics = driver.findElement(By.linkText("Electronics"));
		Actions builder = new Actions(driver);
		
		builder.moveToElement(electronics).build().perform();
		
		//builder.moveToElement(driver.findElement(By.linkText("Electronics"))).build().perform(); //can do this way to.
		
		Thread.sleep(2000);
		
		List<WebElement> all = driver.findElements(By.xpath("(//div[@class='hl-cat-nav__sub-cat-col']/ul)[5]/li"));
		
		System.out.println(all.size());
		
		for(WebElement a : all){
			System.out.println(a.getText());
		}
		
		
		

	}

}
