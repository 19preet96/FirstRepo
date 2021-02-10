package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PopUpTest {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "C:/Learning/Program/SeleniumJars/geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.flipkart.com/");
		
		List<WebElement> ifPop = driver.findElements(By.xpath("//div[@class='_2QfC02']/button"));
		
		Thread.sleep(5000); //for checking if pop-up does not come
		
		if(ifPop.size()>0) {
			driver.findElement(By.xpath("//div[@class='_2QfC02']/button")).click();
		}
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("laptop");
		

	}

}
