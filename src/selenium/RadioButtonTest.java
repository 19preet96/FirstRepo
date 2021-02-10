package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioButtonTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:/Learning/Program/SeleniumJars/geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://www.echoecho.com/htmlforms10.htm");
		
		List<WebElement> optionsRadio = driver.findElements(By.xpath("//td/input[@name='group1']"));
		
		System.out.println(optionsRadio.size());
		
		for(WebElement x : optionsRadio) {
			if(x.isSelected()) {
				System.out.println(x.getAttribute("value") + "-----" + x.isSelected());
				
			}
			
		}
		
		
		optionsRadio.get(2).click();
		
		/*
		 * WebElement radio1 = driver.findElement(By.xpath("//input[@value='cheese']"));
		 * radio1.click();
		 */
		System.out.println("-----------");
		
		for(WebElement x : optionsRadio) {
			if(x.isSelected()) {
				System.out.println(x.getAttribute("value") + "-----" + x.isSelected());
				
			}
			
		}
		

	}

}
