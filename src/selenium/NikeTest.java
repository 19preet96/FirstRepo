package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class NikeTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:/Learning/Program/SeleniumJars/geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://www.nike.com/ca/");
		
		WebElement men = driver.findElement(By.xpath("//a[@data-path='men']"));
		
		Actions builder = new Actions(driver);
		
		builder.moveToElement(men).build().perform();
		
		List<WebElement> menOptions = driver.findElements(By.xpath("//div[@id='DesktopMenu-0-1-0']/div/div[2]/a"));
		
		
		System.out.println(menOptions.size());
		
		for(WebElement x : menOptions) {
			System.out.println(x.getText());
		}
		

	}

}
