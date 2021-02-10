package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownListTest {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "C:/Learning/Program/SeleniumJars/geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.ebay.ca/");
		
		List<WebElement> dropD = driver.findElements(By.xpath("//select[@id='gh-cat']/option"));
		
		System.out.println(dropD.size());
		
		
		for(WebElement x : dropD) {
			System.out.println(x.getText() + "-------" + x.isSelected());
		}
		
		WebElement box = driver.findElement(By.id("gh-cat"));
		Select s = new Select(box);		
		
		s.selectByIndex(2);
		Thread.sleep(2000);
		
		s.selectByValue("20081");
		Thread.sleep(2000);
		
		s.selectByVisibleText("Clothing, Shoes & Accessories");
		Thread.sleep(2000);
		
		System.out.println("-----------");
		
		for(WebElement x : dropD) {
			if(x.isSelected()) {
			System.out.println(x.getText()+ "-----" + x.isSelected());
			}
		}
		
		
		
		
		

	}

}
