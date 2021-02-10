package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class SelfPractice {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:/Learning/Program/SeleniumJars/geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		Actions builder = new Actions(driver);
		
		driver.get("https://artoftesting.com/press-enter-tab-space-arrow-function-keys-in-selenium-webdriver-with-java");
		
		WebElement autoF = driver.findElement(By.linkText("Automation"));
		
		Thread.sleep(2000);
		
		builder.moveToElement(autoF).build().perform();
		
		Thread.sleep(500);
		
		List<WebElement> aList = driver.findElements(By.xpath("//ul[@class='sub-menu']/li"));
		
		for(WebElement z : aList) {
			System.out.println(z.getText());
		}
		
		
		
		//walmart department xpath
		
		//driver.close();
	}

}
