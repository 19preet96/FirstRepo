package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TDListTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:/Learning/Program/SeleniumJars/geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://www.td.com/ca/en/personal-banking/");
		
		List<WebElement> footerOptions = driver.findElements(By.xpath("//div[@class='td-footer-links td-copy-align-centre td-copy-white']/a"));
		
		System.out.println(footerOptions.size());
		
		for(WebElement x: footerOptions) {
			System.out.println(x.getText());
		}
		
		
		

	}

}
