package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FrameTest {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "C:/Learning/Program/SeleniumJars/geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://jqueryui.com/droppable/");
		
		Thread.sleep(1000);
		
		List<WebElement> allOptions1 = driver.findElements(By.linkText("Sortable"));
		
		System.out.println(allOptions1.get(0).getText());
		
		if(allOptions1.size()>0) {
			System.out.println("Element Sortable Presesnt");
		}else {
			System.out.println("Not Present");
		}
		
		System.out.println("------After Switching to Frame-----");
		
		//driver.switchTo().frame(0);
		//driver.switchTo().frame(); //this option works in name and id
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		
		List<WebElement> allOptions2 = driver.findElements(By.id("draggable"));
		
		System.out.println(allOptions2.get(0).getText());
		
		if(allOptions2.size()>0) {
			System.out.println("Element Draggable Presesnt");
		}else {
			System.out.println("Not Present");
		}
		
		System.out.println("-----Switching to Main Frame-----");
		
		driver.switchTo().defaultContent();
		//driver.switchTo().parentFrame(); / if you have frame in frame
		
		

	}

}
