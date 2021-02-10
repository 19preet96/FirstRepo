package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MissisuagaTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:/Learning/Program/SeleniumJars/geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.mississauga.ca/");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//button[contains(text(),'Our organization')]")).click();
		
		List<WebElement> myList = driver.findElements(By.xpath("//ul[@class='dropdown-menu nav-dropdown-menu show']/li"));
		
		System.out.println(myList.size());
		
		for(WebElement a : myList) {
			System.out.println(a.getText());
		}

	}

}
