package selenium;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DragAndDropTest {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.gecko.driver", "C:/Learning/Program/SeleniumJars/geckodriver.exe");
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://jqueryui.com/droppable/");
		WebDriverWait wait = new WebDriverWait(driver, 10);
		
		
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		
		WebElement draggable = driver.findElement(By.id("draggable"));
		
		WebElement droppable = driver.findElement(By.id("droppable"));
		
		//System.out.println(draggable.getText());
		//System.out.println(droppable.getText());
		
		Actions builder = new Actions(driver);
		
		builder.dragAndDrop(draggable, droppable).build().perform();
		wait.until(ExpectedConditions.textToBePresentInElement(droppable, "Dropped!")); //explicit wait/ waits for droppable element to dropped
		
		//WebElement find = driver.findElement(By.xpath(")) //homework using /p
		
		if(droppable.getText().equals("Dropped!")){
			System.out.println("Dropped");
		}else {
			System.out.println("Not Dropped");
		}
		
		
		
		

	}

}
